const antlr4 = require('antlr4');
const fs = require('fs');

const FlightLexer = require('./generated/FlightLexer').default;
const FlightParser = require('./generated/FlightParser').default;
const CustomFlightVisitor = require('./CustomFlightVisitor.cjs');

const input = fs.readFileSync('input.txt', 'utf8').trim();
const chars = new antlr4.InputStream(input);

// 🟦 Lexer 1: solo para mostrar tokens
const lexer1 = new FlightLexer(new antlr4.InputStream(input));
lexer1.reset();

console.log('\n📜 Tabla de Tokens');
console.log('--------------------------------------------------');
console.log('| Tipo               | Lexema       | Línea | Col |');
console.log('--------------------------------------------------');

let token;
do {
  token = lexer1.nextToken();
  if (token.type === antlr4.Token.EOF) break;

  // ✅ ACCESO CORRECTO a symbolicNames desde la instancia del lexer
  const symbolicNames = lexer1.constructor.symbolicNames || [];
  const typeName = symbolicNames[token.type] || `TOKEN_${token.type}`;

  const lexema = (token.text || '').padEnd(12);
  const linea = String(token.line).padEnd(5);
  const col = String(token.column).padEnd(3);

  console.log(`| ${typeName.padEnd(18)} | ${lexema} | ${linea} | ${col} |`);
} while (token.type !== antlr4.Token.EOF);

console.log('--------------------------------------------------\n');

// 🟩 Lexer 2: para análisis sintáctico e interpretación
const lexer2 = new FlightLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer2);
const parser = new FlightParser(tokens);
parser.buildParseTrees = true;
const tree = parser.vuelo();

if (parser._syntaxErrors > 0) {
  console.error("❌ Error de sintaxis en la entrada.");
} else {
  console.log("✅ Entrada válida.");
  const visitor = new CustomFlightVisitor();
  const resultado = visitor.visit(tree);
  console.log("🎯 Resultado:");
  console.log(resultado);
}

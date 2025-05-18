// Generated from c:/Users/Yunuen/Documents/Analizador vuelo/Flight.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FlightParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ON_TIME=4, DELAYED=5, CANCELLED=6, HORA=7, LETRA=8, 
		DIGITO=9, WS=10;
	public static final int
		RULE_vuelo = 0, RULE_codigo_vuelo = 1, RULE_aeropuerto = 2, RULE_hora = 3, 
		RULE_estado = 4, RULE_puerta = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"vuelo", "codigo_vuelo", "aeropuerto", "hora", "estado", "puerta"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "','", "'Gate:'", "'ON_TIME'", "'DELAYED'", "'CANCELLED'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ON_TIME", "DELAYED", "CANCELLED", "HORA", "LETRA", 
			"DIGITO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Flight.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlightParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VueloContext extends ParserRuleContext {
		public Codigo_vueloContext codigo_vuelo() {
			return getRuleContext(Codigo_vueloContext.class,0);
		}
		public List<AeropuertoContext> aeropuerto() {
			return getRuleContexts(AeropuertoContext.class);
		}
		public AeropuertoContext aeropuerto(int i) {
			return getRuleContext(AeropuertoContext.class,i);
		}
		public HoraContext hora() {
			return getRuleContext(HoraContext.class,0);
		}
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public PuertaContext puerta() {
			return getRuleContext(PuertaContext.class,0);
		}
		public VueloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vuelo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).enterVuelo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).exitVuelo(this);
		}
	}

	public final VueloContext vuelo() throws RecognitionException {
		VueloContext _localctx = new VueloContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_vuelo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			codigo_vuelo();
			setState(13);
			aeropuerto();
			setState(14);
			match(T__0);
			setState(15);
			aeropuerto();
			setState(16);
			hora();
			setState(17);
			match(T__1);
			setState(18);
			estado();
			setState(19);
			match(T__1);
			setState(20);
			match(T__2);
			setState(21);
			puerta();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Codigo_vueloContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(FlightParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(FlightParser.LETRA, i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(FlightParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(FlightParser.DIGITO, i);
		}
		public Codigo_vueloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo_vuelo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).enterCodigo_vuelo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).exitCodigo_vuelo(this);
		}
	}

	public final Codigo_vueloContext codigo_vuelo() throws RecognitionException {
		Codigo_vueloContext _localctx = new Codigo_vueloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codigo_vuelo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(LETRA);
			setState(24);
			match(LETRA);
			setState(25);
			match(DIGITO);
			setState(26);
			match(DIGITO);
			setState(27);
			match(DIGITO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AeropuertoContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(FlightParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(FlightParser.LETRA, i);
		}
		public AeropuertoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aeropuerto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).enterAeropuerto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).exitAeropuerto(this);
		}
	}

	public final AeropuertoContext aeropuerto() throws RecognitionException {
		AeropuertoContext _localctx = new AeropuertoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aeropuerto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(LETRA);
			setState(30);
			match(LETRA);
			setState(31);
			match(LETRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HoraContext extends ParserRuleContext {
		public TerminalNode HORA() { return getToken(FlightParser.HORA, 0); }
		public HoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hora; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).enterHora(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).exitHora(this);
		}
	}

	public final HoraContext hora() throws RecognitionException {
		HoraContext _localctx = new HoraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(HORA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EstadoContext extends ParserRuleContext {
		public TerminalNode ON_TIME() { return getToken(FlightParser.ON_TIME, 0); }
		public TerminalNode DELAYED() { return getToken(FlightParser.DELAYED, 0); }
		public TerminalNode CANCELLED() { return getToken(FlightParser.CANCELLED, 0); }
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).enterEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).exitEstado(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_estado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PuertaContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(FlightParser.LETRA, 0); }
		public List<TerminalNode> DIGITO() { return getTokens(FlightParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(FlightParser.DIGITO, i);
		}
		public PuertaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puerta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).enterPuerta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).exitPuerta(this);
		}
	}

	public final PuertaContext puerta() throws RecognitionException {
		PuertaContext _localctx = new PuertaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_puerta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(LETRA);
			setState(38);
			match(DIGITO);
			setState(39);
			match(DIGITO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n*\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000"+
		"\u0001\u0001\u0000\u0004\u0006#\u0000\f\u0001\u0000\u0000\u0000\u0002"+
		"\u0017\u0001\u0000\u0000\u0000\u0004\u001d\u0001\u0000\u0000\u0000\u0006"+
		"!\u0001\u0000\u0000\u0000\b#\u0001\u0000\u0000\u0000\n%\u0001\u0000\u0000"+
		"\u0000\f\r\u0003\u0002\u0001\u0000\r\u000e\u0003\u0004\u0002\u0000\u000e"+
		"\u000f\u0005\u0001\u0000\u0000\u000f\u0010\u0003\u0004\u0002\u0000\u0010"+
		"\u0011\u0003\u0006\u0003\u0000\u0011\u0012\u0005\u0002\u0000\u0000\u0012"+
		"\u0013\u0003\b\u0004\u0000\u0013\u0014\u0005\u0002\u0000\u0000\u0014\u0015"+
		"\u0005\u0003\u0000\u0000\u0015\u0016\u0003\n\u0005\u0000\u0016\u0001\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0005\b\u0000\u0000\u0018\u0019\u0005\b"+
		"\u0000\u0000\u0019\u001a\u0005\t\u0000\u0000\u001a\u001b\u0005\t\u0000"+
		"\u0000\u001b\u001c\u0005\t\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005\b\u0000\u0000\u001e\u001f\u0005\b\u0000\u0000\u001f"+
		" \u0005\b\u0000\u0000 \u0005\u0001\u0000\u0000\u0000!\"\u0005\u0007\u0000"+
		"\u0000\"\u0007\u0001\u0000\u0000\u0000#$\u0007\u0000\u0000\u0000$\t\u0001"+
		"\u0000\u0000\u0000%&\u0005\b\u0000\u0000&\'\u0005\t\u0000\u0000\'(\u0005"+
		"\t\u0000\u0000(\u000b\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from c:/Users/Yunuen/Documents/Analizador vuelo/Flight.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlightParser}.
 */
public interface FlightListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlightParser#vuelo}.
	 * @param ctx the parse tree
	 */
	void enterVuelo(FlightParser.VueloContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlightParser#vuelo}.
	 * @param ctx the parse tree
	 */
	void exitVuelo(FlightParser.VueloContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlightParser#codigo_vuelo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo_vuelo(FlightParser.Codigo_vueloContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlightParser#codigo_vuelo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo_vuelo(FlightParser.Codigo_vueloContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlightParser#aeropuerto}.
	 * @param ctx the parse tree
	 */
	void enterAeropuerto(FlightParser.AeropuertoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlightParser#aeropuerto}.
	 * @param ctx the parse tree
	 */
	void exitAeropuerto(FlightParser.AeropuertoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlightParser#hora}.
	 * @param ctx the parse tree
	 */
	void enterHora(FlightParser.HoraContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlightParser#hora}.
	 * @param ctx the parse tree
	 */
	void exitHora(FlightParser.HoraContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlightParser#estado}.
	 * @param ctx the parse tree
	 */
	void enterEstado(FlightParser.EstadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlightParser#estado}.
	 * @param ctx the parse tree
	 */
	void exitEstado(FlightParser.EstadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlightParser#puerta}.
	 * @param ctx the parse tree
	 */
	void enterPuerta(FlightParser.PuertaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlightParser#puerta}.
	 * @param ctx the parse tree
	 */
	void exitPuerta(FlightParser.PuertaContext ctx);
}
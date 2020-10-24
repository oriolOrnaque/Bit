// Generated from /home/user/IdeaProjects/Bit/src/bit/compiler/parser/bit.g4 by ANTLR 4.8
package bit.compiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bitParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bitVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bitParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(bitParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link bitParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(bitParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link bitParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(bitParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bitParser#id_or_reg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_or_reg(bitParser.Id_or_regContext ctx);
	/**
	 * Visit a parse tree produced by {@link bitParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(bitParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link bitParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(bitParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bitParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(bitParser.BinopContext ctx);
	/**
	 * Visit a parse tree produced by {@link bitParser#unaryop_post}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryop_post(bitParser.Unaryop_postContext ctx);
	/**
	 * Visit a parse tree produced by {@link bitParser#unaryop_pre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryop_pre(bitParser.Unaryop_preContext ctx);
	/**
	 * Visit a parse tree produced by {@link bitParser#reg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg(bitParser.RegContext ctx);
	/**
	 * Visit a parse tree produced by {@link bitParser#regs8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegs8(bitParser.Regs8Context ctx);
	/**
	 * Visit a parse tree produced by {@link bitParser#regs16}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegs16(bitParser.Regs16Context ctx);
}
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
	 * Visit a parse tree produced by {@link bitParser#reg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg(bitParser.RegContext ctx);
	/**
	 * Visit a parse tree produced by {@link bitParser#i86regs8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI86regs8(bitParser.I86regs8Context ctx);
	/**
	 * Visit a parse tree produced by {@link bitParser#i86regs16}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI86regs16(bitParser.I86regs16Context ctx);
}
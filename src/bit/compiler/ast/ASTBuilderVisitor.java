package bit.compiler.ast;

import bit.compiler.ast.nodes.*;
import bit.compiler.ast.nodes.expression.ExpressionNode;
import bit.compiler.ast.nodes.expression.ExpressionNodeBinop;
import bit.compiler.parser.bitBaseVisitor;
import bit.compiler.parser.bitParser;

public class ASTBuilderVisitor extends bitBaseVisitor {

    @Override public AST visitStartRule(bitParser.StartRuleContext ctx)
    {
        AST ast = new AST();
        ast.setRoot(visitProgram(ctx.program()));
        return ast;
    }

    @Override public ProgramNode visitProgram(bitParser.ProgramContext ctx)
    {
        ProgramNode prog = new ProgramNode();

        prog.setStmt(visitStatement(ctx.statement()));

        return prog;
    }

    @Override public StatementNode visitStatement(bitParser.StatementContext ctx)
    {
        StatementNode stmt =  new StatementNode();

        stmt.setReg(visitReg(ctx.reg()));
        stmt.setExpr(visitExpression(ctx.expression()));

        return stmt;
    }

    @Override public RegisterNode visitReg(bitParser.RegContext ctx)
    {
        return new RegisterNode(ctx.getText());
    }

    @Override public ExpressionNode visitExpression(bitParser.ExpressionContext ctx)
    {
        if(ctx.binop() != null)
        {
            return new ExpressionNodeBinop(ctx.binop(), visitExpression(ctx.expression(0)), visitExpression(ctx.expression(1)));
        }

        return new ExpressionNode();
    }

}

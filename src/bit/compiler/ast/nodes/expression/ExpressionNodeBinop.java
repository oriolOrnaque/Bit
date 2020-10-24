package bit.compiler.ast.nodes.expression;

import bit.compiler.parser.bitParser;

public class ExpressionNodeBinop extends ExpressionNode {

    private ExpressionNode expr1;
    private ExpressionNode expr2;
    private bitParser.BinopContext binop;

    public ExpressionNodeBinop(bitParser.BinopContext binop, ExpressionNode expr1, ExpressionNode expr2)
    {
        this.binop = binop;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
}

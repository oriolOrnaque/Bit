package bit.compiler.ast.nodes.expression;

import bit.compiler.parser.bitParser;

public class ExpressionNodeNum extends ExpressionNode
{

    private long num;

    public ExpressionNodeNum(String num)
    {
        this.num = Long.parseLong(num);
    }
}

package bit.compiler.ast;

import bit.compiler.parser.bitParser;

public class ASTBuilder {

    public AST build(bitParser.StartRuleContext start)
    {
        ASTBuilderVisitor astBuilder = new ASTBuilderVisitor();

        return astBuilder.visitStartRule(start);
    }
}

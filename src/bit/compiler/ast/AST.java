package bit.compiler.ast;

import bit.compiler.ast.nodes.ProgramNode;

public class AST {

    private ProgramNode root;

    public AST()
    {

    }

    public void setRoot(ProgramNode prog)
    {
        this.root =  prog;
    }
}

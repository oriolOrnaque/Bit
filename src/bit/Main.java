package bit;

import bit.compiler.Compiler;

public class Main {

    public static void main(String[] args) {
        Compiler compiler = new Compiler();

        compiler.compile(args[0], "output.bin");
    }
}

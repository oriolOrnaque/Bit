package bit.compiler.generator;

import bit.compiler.ast.AST;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class RealModeGen {

    private FileOutputStream out;

    public void emitCode(AST ast, String out)
    {
        File f = new File(out);
        try
        {
            this.out = new FileOutputStream(f);
            emit(ast);
            this.out.flush();
            this.out.close();
            System.out.println("Code generated");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private void emit(AST ast) throws IOException {
        // BIOS BOOTLOADING
        this.out.write(0xb8);
        this.out.write(0xc0);
        this.out.write(0x07);

        this.out.write(0x8e);
        this.out.write(0xd8);
        // PADDING
        this.out.write(0x90);

        //TEST
        this.out.write(0xb8);
        this.out.write(0x34);
        this.out.write(0x12);
        // INFINITE JUMP
        this.out.write(0xe8);
        this.out.write(0xa);

        // HLT
        this.out.write(0xf4);

        // PADDING
        for(int i = 0; i < 510 - 12; ++i)
        {
            this.out.write(0x90);
        }

        // BIOS BOOT MAGIC NUMBER
        this.out.write(0x55);
        this.out.write(0xaa);
    }
}

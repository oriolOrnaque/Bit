package bit.compiler.generator;

import bit.compiler.ast.AST;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import keystone.Keystone;
import keystone.KeystoneArchitecture;
import keystone.KeystoneEncoded;
import keystone.KeystoneMode;
import keystone.exceptions.AssembleFailedKeystoneException;

public class RealModeGen {

    private FileOutputStream out;
    private Keystone keystone;

    public RealModeGen()
    {
        try
        {
            this.keystone = new Keystone(KeystoneArchitecture.X86, KeystoneMode.Mode16);
        }catch(AssembleFailedKeystoneException e)
        {

        }
    }

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
        //this.out.write(0xb8);
        //this.out.write(0xc0);
        //this.out.write(0x07);
        int length = 0;
        KeystoneEncoded enc = this.keystone.assemble("mov ax, 0x07c0");
        this.out.write(enc.getMachineCode());
        length += enc.getMachineCode().length;

        //this.out.write(0x8e);
        //this.out.write(0xd8);
        enc = this.keystone.assemble("mov ds, ax");
        this.out.write(enc.getMachineCode());
        length += enc.getMachineCode().length;

        //TEST
        //this.out.write(0xb8);
        //this.out.write(0x34);
        //this.out.write(0x12);
        enc = this.keystone.assemble("mov ax, 0x1234");
        this.out.write(enc.getMachineCode());
        length += enc.getMachineCode().length;

        // INFINITE JUMP
        //this.out.write(0xe8);
        //this.out.write(0xa);

        enc = this.keystone.assemble("mov ah, 0xe; mov al, 0x41; int 0x10;");
        this.out.write(enc.getMachineCode());
        length += enc.getMachineCode().length;

        // HLT
        //this.out.write(0xf4);

        enc = this.keystone.assemble("hlt");
        this.out.write(enc.getMachineCode());
        length += enc.getMachineCode().length;

        // PADDING
        for(int i = 0; i < 510 - length; ++i)
        {
            this.out.write(0x90);
        }

        // BIOS BOOT MAGIC NUMBER
        this.out.write(0x55);
        this.out.write(0xaa);
    }
}

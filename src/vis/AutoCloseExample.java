/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vis;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author vishnu-pt517
 */
public class AutoCloseExample implements java.lang.AutoCloseable {

    private final DataInputStream dos = new DataInputStream(System.in);

    public AutoCloseExample() {
        System.out.println("The initialization of the class");
    }

    public void printHi() throws IOException {
        System.out.println("Hi");
    }

    @Override
    public void close() throws Exception {
        dos.close();
        System.out.println("The autocloseable->close method invoked");
    }

}

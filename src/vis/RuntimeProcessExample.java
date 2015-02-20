/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author vishnu-pt517
 */
public class RuntimeProcessExample {

    public void testProcess() throws IOException {
        Runtime rt = Runtime.getRuntime();
        String cmd = "systeminfo";
        Process p = rt.exec(cmd);
        
        InputStream in = p.getInputStream();
        Scanner s = new Scanner(in);
        
        FileWriter fout = new FileWriter(new File("status.txt"));
        while (s.hasNext()) {
            String temp = s.nextLine();
            fout.append(temp+"\n");
            System.out.println(temp);
        }        
        fout.flush();        
        if (p.isAlive()) {
            p.destroy();
        }
        fout.close();
        in.close();
    }
}

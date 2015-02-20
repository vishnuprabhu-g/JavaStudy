/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudy;

import java.io.IOException;
import vis.AutoCloseExample;
import vis.EnumExample;
import vis.RuntimeProcessExample;

/**
 *
 * @author vishnu-pt517
 */
public class JavaStudy {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       /* JavaStudy obj = new JavaStudy();
        obj.autoCloseableDemo();*/

       /* EnumExample obj2 = new EnumExample();
        obj2.printAllEnum();
        System.out.println("");
        obj2.print();*/
        
        vis.RuntimeProcessExample obj3=new RuntimeProcessExample();
        obj3.testProcess();
    }

    public void autoCloseableDemo() {
        try (AutoCloseExample obj = new AutoCloseExample()) {
            obj.printHi();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

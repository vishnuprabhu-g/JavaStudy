/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudy;

import vis.AutoCloseExample;

/**
 *
 * @author vishnu-pt517
 */
public class JavaStudy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaStudy obj = new JavaStudy();
        obj.autoCloseableDemo();
    }

    public void autoCloseableDemo() {
        try (AutoCloseExample obj = new AutoCloseExample()) {
            obj.printHi();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

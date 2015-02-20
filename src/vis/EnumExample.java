/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vis;

/**
 *
 * @author vishnu-pt517
 */
public class EnumExample {
    public void printAllEnum()
    {
        for(Numbers n:Numbers.values())
        {
            System.out.println(n);
        }
    }
    public void print()
    {
        System.out.println(Numbers.one);
    }
}

enum Numbers
{
    one,two,three,four,five
}
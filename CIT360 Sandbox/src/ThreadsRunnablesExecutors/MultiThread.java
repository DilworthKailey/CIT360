/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsRunnablesExecutors;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kailey
 */
public class MultiThread {
    
    public static void main(String[] args)
    {
        A obj = new A();
        obj.start();
        
        B obj2 = new B();
        obj2.start();
    }
    
}
class A extends Thread
{
    public void show()
    {
        for(int i = 0; i <= 4; i++)
        {
        System.out.println("Hiya!");
        
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void run()
    {
        show();
    }
}
class B extends Thread
{
    public void show()
    {
        for(int i = 0; i <= 4; i++)
        {
        System.out.println("Hello!");  
        
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void run()
    {
        show();
    }
}

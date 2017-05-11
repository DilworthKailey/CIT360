/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsRunnablesExecutors;

/**
 *
 * @author Josh
 */
public class MultiThread extends HelloThread{
    
    public void run(){
        System.out.println("Thread Running: " + HelloThread.currentThread().getName());
    }
    
    public static void main(String args[]){
        MultiThread mt = new MultiThread();
        mt.run();
    }
    
}

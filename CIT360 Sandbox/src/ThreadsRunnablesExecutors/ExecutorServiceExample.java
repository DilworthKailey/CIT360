/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsRunnablesExecutors;

/**
 *
 * @author Kailey
 */
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    
    public static void main(String[] args) throws InterruptedException {
        
        //print deposit
        //wait
        //print withdraw
        //wait
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 1; i <= 10; i++){
            executorService.execute(new Runnable(){
                
                public void run(){
                try{
                    System.out.println("First");
                    Thread.currentThread().sleep(2000);
                    System.out.println("Second");
                    Thread.currentThread().sleep(2000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }});
        }
        
    }
    
}

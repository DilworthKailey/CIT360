/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationController;

import java.util.Scanner;

/**
 *
 * @author kailey
 */
public class AppControlDemo {
    public static void main(String[] args) throws InterruptedException {
        AppController frontController = new AppController();
        frontController.dispatchRequest("FIRST");
        System.out.println();
        frontController.dispatchRequest("SECOND");
        System.out.println();
        frontController.dispatchRequest("THIRD");
        Scanner input = new Scanner(System.in);
        AppController app = new AppController();
        app.dispatchRequest(input.next());
        System.out.println("Thank you for trying out my application controller!");
    }
    
}

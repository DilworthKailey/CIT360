/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationController2;

import java.util.Scanner;

/**
 *
 * @author Kailey
 */
public class AppControlExample {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please type RPG, Adventure, or Indie to learn which games of the genre are my favorite.");
        AppController app = new AppController();
        app.dispatchRequest(input.next());
        
    }
    
}

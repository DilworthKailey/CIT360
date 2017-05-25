/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationController;

import java.util.Scanner;

/**
 *
 * @author Kailey
 */
public class ThirdPage {
    Scanner scanner = new Scanner(System.in);
    public static boolean calledOnce = false;
    public void show(){
        System.out.println("Displaying Third Page");
 
        if (calledOnce == true){
            System.out.println("Would you like to go 'left' or 'right'? Type which direction you'd like to go.");
            String line = scanner.nextLine();
            if (line.equals("left") || line.equals("Left")){
                System.out.println("You are eaten by a horrible beast. Game Over.");
            } else if (line.equals("right") || line.equals("Right")){
                System.out.println("You find a cave full of treasure! Take your earnings and invest them well!");
            } else {
                System.out.println("Due to your indecisiveness, you become lost in the confines of your own imagination.");
            }
        } else{
            System.out.println("To go on an adventure, call this page again when prompted.");
        }
    }
    
}

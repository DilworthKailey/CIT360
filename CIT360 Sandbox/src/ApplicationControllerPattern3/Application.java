/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationControllerPattern3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kailey
 */
public class Application {
    public static void main(String[] args){
        ApplicationController dispatcher = new ApplicationController();
        String add = "add";
        String sub = "sub";
        String div = "div";
        String mul = "mul";
        Integer num1 = -5;
        Integer num2 = 5;
        String command;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = Integer.parseInt(in.nextLine());

        System.out.println("Enter a calculation command(+, -, /, or *): ");
        command = in.nextLine();
        if (command.equals("+") || command.equals("-") || command.equals("/") || command.equals("*")){
            
        } else {
            System.out.println("You must enter a valid calulation command."
                    + "\nRestart and try again with +, -, /, or * with no spaces");
            return;
        }

        System.out.println("Enter the second number: ");
        num2 = Integer.parseInt(in.nextLine());
        
        if (num2 == 0 && command.equals("/")){
            System.out.println("Divide by 0 error. Restart and try again.");
            return;
        } else{
            System.out.print(num1 + " " + command + " " + num2 + " = ");
            dispatcher.handleCommand(command,num1,num2); 
        }

    }
}

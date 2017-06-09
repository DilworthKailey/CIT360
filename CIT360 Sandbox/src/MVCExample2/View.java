/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCExample2;

/**
 *
 * @author Kailey
 */
public class View {
    public void printGameDetails(String gameTitle, String gameRating, String gameCompany){
      System.out.println("Game: ");
      System.out.println("Title: " + gameTitle);
      System.out.println("Rating: " + gameRating);
      System.out.println("Company: " + gameCompany);
   }
}

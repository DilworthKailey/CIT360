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
public class MVC {
     public static void main(String[] args) {

      Game model  = retriveGameFromDatabase();

      View view = new View();

      Controller controller = new Controller(model, view);

      controller.updateView();

      controller.setGameTitle("Super Mario Bros.");
      controller.setGameRating("E");
      controller.setGameCompany("Nintendo");

      controller.updateView();
   }

   private static Game retriveGameFromDatabase(){
      Game game = new Game();
      game.setTitle("Final Fantasy IX");
      game.setRating("T");
      game.setCompany("Square Enix");
      return game;
   }
    
}

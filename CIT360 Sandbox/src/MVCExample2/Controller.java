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
public class Controller {
    private Game model;
    private View view;

   public Controller(Game model, View view){
      this.model = model;
      this.view = view;
   }

   public void setGameTitle(String title){
      model.setTitle(title);		
   }

   public String getGameTitle(){
      return model.getTitle();		
   }

   public void setGameRating(String rating){
      model.setRating(rating);		
   }

   public String getGameRating(){
      return model.getRating();		
   }
   
      public void setGameCompany(String company){
      model.setCompany(company);		
   }

   public String getGameCompany(){
      return model.getCompany();		
   }
   
    public void updateView(){				
      view.printGameDetails(model.getTitle(), model.getRating(), model.getCompany());
   }	

}

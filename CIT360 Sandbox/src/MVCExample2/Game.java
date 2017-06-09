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
public class Game {
   private String rating;
   private String title;
   private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
   
   public String getRating() {
      return rating;
   }
   
   public void setRating(String rating) {
      this.rating = rating;
   }
   
   public String getTitle() {
      return title;
   }
   
   public void setTitle(String title) {
      this.title = title;
   }
}

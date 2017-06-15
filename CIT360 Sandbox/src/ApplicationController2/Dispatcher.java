/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationController2;

/**
 *
 * @author Kailey
 */
public class Dispatcher {
    private RPGReview RPG;
    private AdventureReview Adventure;
    private IndieReview Indie;
    
    public Dispatcher(){
        RPG = new RPGReview();
        Adventure = new AdventureReview();
        Indie = new IndieReview();
    }
    
    public void dispatch(String request){
        if(request.equalsIgnoreCase("RPG"))
        {
            RPG.show();
        }
        else if(request.equalsIgnoreCase("Adventure"))
        {
            Adventure.show();
        }
        else {
            Indie.show();
        }
    }
    
}

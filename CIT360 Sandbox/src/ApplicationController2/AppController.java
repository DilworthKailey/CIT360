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
public class AppController {
    private Dispatcher dispatcher;
    
    public AppController(){
        
        dispatcher = new Dispatcher();
        
    }
    
    private boolean isAuthenticUser(){
        System.out.println("User Authentication: Success");
        return true;
    }
    
    private void trackRequest(String request){
        System.out.println(request + " page requested.");
    }
    
    public void dispatchRequest(String request){
        
        trackRequest(request);
        
        if ( isAuthenticUser()){
            dispatcher.dispatch(request);
        }
        
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationController;

/**
 *
 * @author Josh
 */
class AppController {
    
    private Dispatcher dispatcher;
    
    public AppController(){
        dispatcher = new Dispatcher();
    }
    
    private boolean isPageRequested(){
        System.out.println("The page was requested successfully.");
        return true;
    }
    
    private void trackRequest(String request){
        System.out.println("Page requested: " + request);
    }
    
    public void dispatchRequest(String request) throws InterruptedException {
        trackRequest(request);
        
        if(isPageRequested()){
            dispatcher.dispatch(request);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

/**
 *
 * @author Kailey
 */
import java.util.*;

public class TreeSet {
    
    private static void main(String args[]){
        //Create tree set
        TreeSet ts = new TreeSet();
        
        //Add Elements to tree set
        ts.add("Cat");
        ts.add("Dog");
        ts.add("Elephant");
        ts.add("Mouse");
        ts.add("Donut");
        ts.add("Snake");
        
        System.out.println(ts);
    }
    
}

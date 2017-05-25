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

public class Map {
    
    public static void main(String[]args) {
        HashMap m1 = new HashMap();
        m1.put("Josh", "28");
        m1.put("Kailey", "25");
        m1.put("Jayden", "4");
        m1.put("Daniel", "2");
        
        System.out.println();
        System.out.println("Map Elements: ");
        System.out.println("\t" + m1);
        
        System.out.println("How old is Kailey?");
        System.out.println(m1.get("Kailey"));
        //Josh's birthday is coming in a couple days, so let's change his key to 29
        m1.put("Josh", "29");
        
        System.out.println();
        System.out.println("Map Elements: ");
        System.out.println("\t" + m1);
        //Remove the "Daniel" key
        m1.remove("Daniel");
        System.out.println();
        System.out.println("Map Elements: ");
        System.out.println("\t" + m1);
        
    }
    
}

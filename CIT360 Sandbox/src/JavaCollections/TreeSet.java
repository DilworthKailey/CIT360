/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;
import java.util.*;


/**
 *
 * @author Kailey
 */
public class TreeSet {
    public static void main(String args[]){
            TreeSet<Integer> setNumbers = new TreeSet<Integer>();
            setNumbers.addAll(Arrays.asList(2, 24, 15, 63, 3, 6, 74, 15));
            System.out.println("Sorted Set: " + setNumbers);
 
    }

}

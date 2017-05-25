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

public class HashSetExample {

    public static void main(String[] args) {

        int count[] = {25, 75, 12, 6, 39};
        Set<Integer> set = new HashSet<Integer>();
        try{
            for(int i = 0; i < 5; i++){
                set.add(count[i]);
            }
            System.out.println(set);
            //A treeset will order the elements found in the list from least to greatest
            TreeSet sortedSet = new TreeSet<Integer>(set);
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);
            //find the first element of the list
            System.out.println("The first element of the set is: "+ (Integer)sortedSet.first());
            //find the last element of tne list
            System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
            
            sortedSet.remove(39);
            //This will not add because it is a duplicate
            sortedSet.add(75);
            //This will add a number less than those included in the list and sort it at the front
            sortedSet.add(2);
            System.out.println(sortedSet);
        }
        catch(Exception e){}
    }

}


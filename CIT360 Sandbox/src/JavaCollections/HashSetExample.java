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

        String [] things = {"banana", "orange", "apple", "lettuce", "turnip"};
        List<String> list = Arrays.asList(things);

        System.out.printf("%s ", list);
        System.out.println();

        Set<String> set = new HashSet<>(list);
        System.out.printf("%s ", set);  
    }

}


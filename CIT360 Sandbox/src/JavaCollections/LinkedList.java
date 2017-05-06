/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.*;
/**
 *
 * @author Josh
 */
public class LinkedList {
    public static void main(String[] args) {
        
        String[] groceries = {"milk", "eggs", "bread", "cheese", "icecream"};
        List<String> list1 = new java.util.LinkedList<String>();
        for(String x : groceries)
            list1.add(x);
        
        String[] shopping = {"paper", "pencils", "shoes", "books"};
        List<String> list2 = new java.util.LinkedList<String>();
        for (String y : shopping)
            list2.add(y);
        
        list1.addAll(list2);
        list2 = null;
        
        printMe(list1);
        removeItems(list1, 2, 5);
        printMe(list1);
        reverseList(list1);
    }
    
    //printMe method
    private static void printMe(List<String> list){
        for(String b : list)
            System.out.printf("%s ", b);
        System.out.println();
    }
    
    //removeItems method
    private static void removeItems(List<String> list, int from, int to){
        list.subList(from, to).clear();
    }
    
    //reverseList method
    private static void reverseList(List<String> list){
        ListIterator<String> i = list.listIterator(list.size());
        while(i.hasPrevious())
            System.out.printf("%s ", i.previous());
    }
    
}

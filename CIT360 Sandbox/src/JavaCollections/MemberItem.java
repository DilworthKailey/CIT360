/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class MemberItem {
    public static void main(String[] args){
        String[] family = {"josh", "kailey", "daniel", "jayden"};
        List<String> list1 = new ArrayList<String>();
        
        //add array items to list
        for(String x: family)
            list1.add(x);
        
        String[] brownEyes = {"kailey", "jayden"};
        List<String> list2 = new ArrayList<String>();
        
        //add array items to list
        for(String y: brownEyes)
            list2.add(y);
        
        String[] blueEyes = {"josh", "daniel"};
        List<String> list3 = new ArrayList<String>();
        
        //add array items to list
        for(String z: blueEyes)
            list3.add(z);
        
           System.out.println("Family Members:");
       for(int i = 0; i<list1.size(); i++) {
           System.out.printf("%s ", list1.get(i));
       }
           System.out.println("\nBrown Eyes:");
       for(int i = 0; i<list2.size(); i++) {
           System.out.printf("%s ", list2.get(i));
       }
           System.out.println("\nBlue Eyes:");
       for(int i = 0; i<list3.size(); i++) {
           System.out.printf("%s ", list3.get(i));
       }
    }
}
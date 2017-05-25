/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import java.util.*;

/**
 *
 * @author Kailey
 */
public class ArrayTest {
    
    public static int[] main(int[] input){
        
        int[] iArr = input;
        
        System.out.println(iArr);
        
        Arrays.sort(iArr);
        
        System.out.println("The sorted array is: ");
        System.out.println(iArr);

        return iArr;
    }
    
}

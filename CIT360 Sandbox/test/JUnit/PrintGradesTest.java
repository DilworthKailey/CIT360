/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josh
 */
public class PrintGradesTest {
    
    public PrintGradesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSomeMethod() {
        System.out.println("\tTest case #1");
        PrintGrades pg = new PrintGrades();
        String result = pg.print(95);
        assertEquals("Incorrect Message was recieved", "You got an A!", result);
        
        System.out.println("\tTest case #2");
        pg = new PrintGrades();
        result = pg.print(85);
        assertEquals("Incorrect Message was recieved", "You passed with a B!", result);
        
        System.out.println("\tTest case #3");
        pg = new PrintGrades();
        result = pg.print(75);
        assertEquals("Incorrect Message was recieved", "You are average. C grade for you.", result);
        
        System.out.println("\tTest case #4");
        pg = new PrintGrades();
        result = pg.print(20);
        assertEquals("Incorrect Message was recieved", "Should have studied your Java better...", result);
        
    }
    
}

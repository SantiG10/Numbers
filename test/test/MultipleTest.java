/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import numbers.Multiple;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author santig
 */
public class MultipleTest {
    
    private Multiple multiple;
    
    public MultipleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        multiple = new Multiple();
    }
    
    @After
    public void tearDown() {
    }
    
    // Test valida los múltiplos de 3
    @Test
    public void testMultipleFizz() {
        System.out.println("Test Multiple Fizz");
        int number = 27;
        String result = multiple.validateMultiple(number);
        assertEquals("Fizz", result);
    }
    
    // Test valida los múltiplos de 5
    @Test
    public void testMultipleBuzz() {
        System.out.println("Test Multiple Buzz");
        int number = 55;
        String result = multiple.validateMultiple(number);
        assertEquals("Buzz", result);
    }
    
    // Test valida los múltiplos de 3 y 5
    @Test
    public void testMultipleFizzBuzz() {
        System.out.println("Test Multiple FizzBuzz");
        int number = 45;
        String result = multiple.validateMultiple(number);
        assertEquals("FizzBuzz", result);
    }
}

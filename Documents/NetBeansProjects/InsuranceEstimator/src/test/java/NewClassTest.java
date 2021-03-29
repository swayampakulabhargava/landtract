/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author hari's
 */
public class NewClassTest {
    
    public NewClassTest() {
    }

  

    @Test
    public void testCalculateLifeInsurance() throws Exception {
        System.out.println("calculateLifeInsurance");
        int age = 33;
        double expResult = 465.0;
        double result = NewClass.calculateLifeInsurance(age);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testThatExceptionThrown() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            NewClass.calculateLifeInsurance(2);
        });
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hari's
 */
public class NewClass1Test {
    
    public NewClass1Test() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        
    }

    @Test
    public void testChecks() {
        System.out.println("checks");
        int numberofchecks = 0;
        double expResult = 0.0;
        double result = NewClass1.checks(numberofchecks);
        assertEquals(expResult, result, 0.0);
    }
    
}

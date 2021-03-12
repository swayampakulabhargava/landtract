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
public class NewClassTest {
    
    public NewClassTest() {
    }

    
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int[] x = {1,2,3,4,5,6};
        int expResult = 21;
        int result = NewClass.getTotal(x);
        
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] x = {1,2,3,4,5,6};
        double expResult = 3.0;
        double result = NewClass.getAverage(x);
        
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] x = {1,2,3,4,5,6};
        int expResult = 6;
        int result = NewClass.getHighest(x);
        
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] x = {1,2,3,4,5,6};
        int expResult = 1;
        int result = NewClass.getLowest(x);
        
    }
    
}

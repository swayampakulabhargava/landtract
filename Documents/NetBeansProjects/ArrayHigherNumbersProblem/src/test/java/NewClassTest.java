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
    public void testTotalcount() {
        System.out.println("totalcount");
        int[] number = {1,2,3,4,5,6};
        int num = 4;
        NewClass.totalcount(number, num);
    }
    
}

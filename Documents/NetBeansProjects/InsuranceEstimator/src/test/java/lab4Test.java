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
public class lab4Test {
    
    public lab4Test() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        lab4.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCustomer() {
        System.out.println("Customer");
        int customersage = 100;
        lab4.Customer(customersage);
        fail("The test case is a prototype.");
    }
    
}

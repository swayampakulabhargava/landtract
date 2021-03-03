/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hari's
 */
import java.util.Scanner;
public class lab4 {

   // private static int customersage;
    public static void main(String[] args){
               Scanner keyboard = new Scanner(System.in);
               System.out.println("enter the age of the customer");
              int age = keyboard.nextInt() ;
              Customer(age);
             
       
    }    
  //  int customersage int lifeinsurence;
    public static void Customer(int customersage){
        int lifeinsurence = 0;    
       //int lifeinsurence = 0;
        // Scanner keyboard = new Scanner(System.in);
 //int customersage = keyboard.nextInt();
         lifeinsurence = 5*customersage+300;        
         System.out.println("the estimate life insurance cost per year:" + lifeinsurence);
    } 
}
            
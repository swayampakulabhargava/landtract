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
public class NewClass1{

    public static void main(String[] args){
               Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the number of checks for the month: ");
              int checks = keyboard.nextInt() ;
checks(checks);
    System.out.println(checks(checks));
)
  }    
    public static double checks(int numberofchecks){
       double  checkfee = 0;
       double  basefee = 10;
        double finalcharge = 0;
        if (numberofchecks < 20) {
      checkfee = 0.10;
    } else if (numberofchecks >= 20 && numberofchecks < 40) {
      checkfee = 0.08;
    } else if (numberofchecks >= 40 && numberofchecks < 60) {
      checkfee = 0.06;
    } else {
      checkfee = 0.04;
    }

    finalcharge = basefee + (checkfee * numberofchecks);

    return finalcharge;
    } 
}


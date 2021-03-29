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

public class NewClass {
    
public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = keyboard.nextInt();

      // double lifeinsuranceCost = calculateLifeInsurance(age);
        
       // System.out.println("Your estimate is " + lifeinsuranceCost);
           try {
            double lifeinsuranceCost = calculateLifeInsurance(age);
            System.out.println("Your estimate is : $" + lifeinsuranceCost);
        }catch (InvalidAgeException ex){
            System.out.println("Its invalid age !");
        }

    }

   public static double calculateLifeInsurance(int age) throws InvalidAgeException{
        if (age < 5 || age > 110) {
            throw new InvalidAgeException("Invalid age");
        }
    
   //public static double calculateLifeInsurance(int age) {
        double lifeinsuranceCost = (5 * age) + 300;
        return lifeinsuranceCost;
    }

    
}
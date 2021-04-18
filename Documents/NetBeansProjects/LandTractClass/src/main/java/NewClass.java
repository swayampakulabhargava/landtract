
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author hari's
 */

public class NewClass {

    public static void main(String[] args) {
        double Length;
        double Width;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the Length of 1st LandTract: ");
        Length = keyboard.nextDouble();
        System.out.print("Enter the Width of 1st LandTract: ");
        Width = keyboard.nextDouble();
        LandTract Lan1 = new LandTract(Length, Width);
        System.out.print("Enter the Length of 2nd LandTract: ");
        Length = keyboard.nextDouble();

        System.out.print("Enter the Width of 2nd LandTract: ");
        Width = keyboard.nextDouble();
        LandTract Lan2 = new LandTract(Length, Width);

        System.out.print("Lan1 Area: " + Lan1.getArea());
        System.out.print("Lan2 Area: " + Lan2.getArea());
        if (Lan1.equals(Lan2)) {
            System.out.print("The two tracts have the same size:");
        } else {
            System.out.print("The two tracts does not have the same size:");
        }
    }

}

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
    final int array = 6;
    int[] value = new int[array];
    getValues(value);
    getTotal(value);
    getAverage(value);
    getHighest(value);
    getLowest(value);
  }
  public static int getTotal(int[] x) {
    int total = 0;
    for (int num = 0; num < x.length; num++) {
      total += x[num];
    }
    System.out.println("The total is " + total);
    return total;
  }
  public static double getAverage(int[] x) {
    int total = 0;
    for (int num = 0; num < x.length; num++) {
      total += x[num];
  }
    double average = (total /6 );
    System.out.println("The average is " + average);
    return average;
  }
  public static int getHighest(int[] x) {
    int highest = x[0];
    for (int num = 1; num < x.length; num++) {
      if (x[num] > highest)
        highest = x[num];
    }
    System.out.println("The highest value is " + highest);
    return highest;
  }
  public static int getLowest(int[] x) {
   int lowest = x[0];
   for (int num = 1; num < x.length; num++) {
    if (x[num] < lowest)
        lowest = x[num];
    }
    System.out.println("The lowest value is " + lowest);
    return lowest;
  }
  private static void getValues(int[] array) {
    Scanner keyboard = new Scanner(System.in);
    for (int num = 0; num < array.length; num++) {
      System.out.print("Enter number " + (num + 1) + ": ");
      array[num] = keyboard.nextInt();
    }
  }
}

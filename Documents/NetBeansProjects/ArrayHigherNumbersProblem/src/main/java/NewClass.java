/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hari's
 */
public class NewClass {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 6 };
    int n = 4;
    totalcount(numbers, n);
  }

  public static void totalcount(int[] number, int num) {

    for (int i = 0; i < number.length; i++) {
      if (number[i] > num) {
        System.out.println(number[i]);
      }
    }

  }
}

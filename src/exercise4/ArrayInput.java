package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

  public static void main (String[] args) {
     Scanner input = new Scanner(System.in);
     
     int = input.nextInt();
     int[] numbers = new int [a];

     System.out.println ("Enter numbers: ");
     for (int index = 0; index < numbers.lenght; index++) {
       numbers [index] = input.nextInt();
     }

    String numbersAsString = Arrays.toString(numbers);
        System.out.println("Numbers: " + numbersAsString);
  }
}
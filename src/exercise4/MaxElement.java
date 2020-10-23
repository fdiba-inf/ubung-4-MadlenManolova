package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt ();
        double[] numbers = new double[a];
        
        System.out.println("Enter numbers: ");
        double max= 0; 
        for  ( int index = 0; index < numbers.length; index++) {
        numbers[index] = input.nextDouble();
        if (max<numbers[index]){
          max = numbers[index];
        }
        }
        

          System.out.println(max);
         
    }
}
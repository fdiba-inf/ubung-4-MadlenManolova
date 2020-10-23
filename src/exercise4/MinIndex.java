package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Groesse = input.nextInt ();
        double[] numbers = new double[Groesse];
        
        System.out.println("Enter numbers: ");
        int min= 0; 
        for  ( int index = 0; index < numbers.length; index++) {
         numbers[index] = input.nextDouble();
         }
        double minnumber = numbers[0];
        for (int index=0; index < numbers.length; index++)
         {
          if (minnumber>numbers[index]){
            min = index;
            minnumber = numbers[index];
           }
         }
        

          System.out.println("Min index: " + min);
         
    }
}
package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);

    int Groesse = input.nextInt ();
    char[] numbers = new char[Groesse];
        
    System.out.println("Enter numbers: ");

    for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.next().charAt(0);
        }
        char[] numbers+ = new char[Groesse];
        for (int i=0; i < numbers+.length;i++){
          numbers+[i]= numbers[numbers.length];
        }

    
        System.out.println("Reversed symbols: " + Arrays.toString(numbers));
  }

}
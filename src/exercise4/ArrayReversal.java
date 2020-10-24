package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int groesse  = input.nextInt();
        char[] numbers = new char[groesse];

        System.out.println("Enter letter: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.next().charAt(0);
        }
        char[] num= new char[groesse];
        for (int i=0; i < num.length;i++){
          num[i]= numbers[numbers.length -1 - i];
        }
        String numAsString = Arrays.toString(num);
        System.out.println("Reversed symbols: " + numAsString);
        
    

    }

}
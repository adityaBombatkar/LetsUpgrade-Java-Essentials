//Create an int array of size 5, take all the values from the user, add all the values and print the sum.

package com.Assignment3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five numbers: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = s.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; i++)
        {
            sum = sum + numbers[i];
        }
        System.out.print("Sum of array values is: " + sum);
    }
}

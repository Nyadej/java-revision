/*
 * Write a program that asks the user for input until the user inputs 0. 
 * After this the program prints the amount of numbers inputted and the sum of the numbers. 
 * The number zero does not need to be added to the sum, but adding it does not change the results.

You need two variables to keep track of the information. 
Use one for keeping track of the numbers inputted and other for keeping track of the sum
 */

import java.util.Scanner;

public class NumberSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0; // variables NumberOfNumbers and SumofNumbers should be initialized to 0
        int sumofNumbers = 0; 

        while (true) {
            System.out.println("Give a number: ");
            int numberFromUser = Integer.valueOf(scanner.nextLine());

            if (numberFromUser == 0) {
                break; 
            }

            sumofNumbers += numberFromUser; // add numberFromUser to sumOfNumbers
            numberOfNumbers += 1; // increment numberOfNumbers by 1
        }

        System.out.println("Sum of numbers: " + sumofNumbers);
        System.out.println("Number of number: " + numberOfNumbers);
    }
}

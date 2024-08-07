/*
 * Write a program that asks the user for input until the user inputs 0. 
 * After this, the program prints the average of the positive numbers (numbers that are greater than zero).

If no positive number is inputted, the program prints "Cannot calculate the average"
 */

import java.util.Scanner;

public class AverageOfPostitve {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int countOfNumbers = 0;
        
        while (true) {
            System.out.println("Give a number: "); 
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                // The sum and count should be updated only if the input is positive.
                sumOfNumbers += input;
                countOfNumbers += 1;
            }
        }
            // Calculate and print the average if there are positive numbers
            if (countOfNumbers > 0) {
                double average = (double) sumOfNumbers / countOfNumbers;
                System.out.println("Average of positive numbers: " + average);  // Print the average of positive numbers
            } else {
                System.out.println("Cannot calculate the average");
            }
    }
}

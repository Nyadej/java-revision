/*
 * Write a program that reads values from the user until they input a 0. 
 * After this, the program prints the total number of inputted values. 
 * The zero that's used to exit the loop should not be included in the total number count.
 */

import java.util.Scanner;

public class NumberofNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            //if (number > 0) || (number < 0) { - not needed. You should count all non-zero inputs, not just positive numbers.
                numbers = numbers + 1;
            }
            // Print the total count after the loop exits
            System.out.println("Number of numbers: " + numbers);
        }
    }

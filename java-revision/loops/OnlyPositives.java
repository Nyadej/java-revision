/*
 * Write a program that asks the user for numbers. 
 * If the number is negative (smaller than zero), the program prints for user "Unsuitable number" and asks the user for a new number. 
 * If the number is zero, the program exits the loop. 
 * If the number is positive, the program prints the number to the power of two.
 */

import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // The task is to ask the user for an input
            System.out.println("Give me a number:");
            // The task is to read a number from the user
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            }

            if (number > 0) {
                System.out.println((int)Math.pow(number,2)); // For exponentiation, you use Math.pow(number, 2). We cast it to int to match the expected output format.
                continue;
            }
        }

    }
}

/*
 * Write a program that reads an integer from the user. 
 * Next, the program prints numbers from 0 to the number given by the user. 
 * You can assume that the user always gives a positive number. 
 */

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give me a number: "); // The prompt “Give me a number: “ should be outside the loop since you only need to ask for the number once.
        int number = Integer.valueOf(scanner.nextLine());  // Read the input from the user and convert it to an integer

        for (int i = 0; i <= number; i++) { // The loop should print numbers starting from 0 up to the user’s input.
            System.out.println(i);
        }
        
    }
}

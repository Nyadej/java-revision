/*
 * Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
 */

import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number? ");
        int n = Integer.valueOf(scanner.hasNextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum +=i;
        }
        
        System.out.println("The sum is " + sum);
    }
}

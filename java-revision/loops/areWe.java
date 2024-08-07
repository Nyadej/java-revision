/*
 * Write a program, according to the preceding example, that asks the user to input values until they input the value 4.
 
 Sample output
 Give a number:
 5
 Give a number:
 744
 Give a number:
 22
 Give a number:
 -1
 Give a number:
 4
 */

import java.util.Scanner;

public class areWe {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int command = Integer.valueOf(scanner.nextLine());
            if (command == 4) {
                break;
            }

            System.out.println(command);
        }

        System.out.println("Program ended!");
    }
    
}

package java_revision.loops;

import java.util.Scanner; //import statement to use the scanner class for input

/*
 * Write a program by using the loop example that asks "Shall we carry on?" until the user inputs the string "no".

Sample output
Shall we carry on?
yes
Shall we carry on?
ye
Shall we carry on?
y
Shall we carry on?
no
 */

public class Carry {
    public static void main(String[] args) { // entry point of the java application
        Scanner scanner = new Scanner(System.in); // create a scanner object for reading input

        while (true) {
            System.out.println("Shall we carry on? (no exits)");
            String input = scanner.nextLine(); // read the user input
            if (input.equals("no")) { // check if the input is "no" to exit the loop
                break;
            }

            System.out.println("Ok! Let's carry on!");
        }

        System.out.println("Ok, that's enough now.");
    }
}

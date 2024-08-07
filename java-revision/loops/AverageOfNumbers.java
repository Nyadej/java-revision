import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the user

        int sumOfNumbers = 0;  // Initialize a variable to store the sum of numbers
        int countOfNumbers = 0;  // Initialize a variable to store the count of numbers

        while (true) {  // Start an infinite loop to continuously ask for input
            System.out.println("Give a number: ");  // Prompt the user to give a number
            int number = Integer.valueOf(scanner.nextLine());  // Read the input from the user and convert it to an integer

            if (number == 0) {  // Check if the input is 0
                break;  // If the input is 0, exit the loop
            }

            sumOfNumbers += number;  // Add the input number to the sum
            countOfNumbers += 1;  // Increment the count of numbers by 1
        }

        // Calculate the average if at least one number was inputted
        if (countOfNumbers > 0) {
            double average = (double) sumOfNumbers / countOfNumbers;  // Calculate the average by dividing the sum by the count
            System.out.println("Average of numbers: " + average);  // Print the average of the numbers
        } else {
            System.out.println("No numbers were inputted.");  // Print a message if no numbers were inputted
        }
    }
}

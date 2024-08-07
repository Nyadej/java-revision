import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number: "); 
        int number = Integer.valueOf(scanner.nextLine()); // Read the input from the user and convert it to an integer

        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

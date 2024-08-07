import java.util.Scanner;

public class FromWhere2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?: "); // Prompt the user for the upper limit
        int upperLimit = Integer.valueOf(scanner.nextLine()); // Read and convert the input to an integer
        
        System.out.println("Where from?: "); // Prompt the user for the upper lower limit
        int lowerLimit = Integer.valueOf(scanner.nextLine());

        if (upperLimit < lowerLimit) {
            return; // Instead of printing “Error”, you can simply not print anything when the upper limit is smaller than the lower limit as per the problem description.
        }

        for (int i = lowerLimit; i <= upperLimit; i++ ) {
            System.out.println(i);
        }
    }
}

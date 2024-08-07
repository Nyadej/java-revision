import java.util.Scanner;

public class FromWhere1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Count up to: "); // Prompt the user for the upper limit
        int number = Integer.valueOf(scanner.nextLine()); // Read and convert the input to an integer

        for (int i = 1; i <= number; i++ ) {
            System.out.println(i);
        }
    }
}

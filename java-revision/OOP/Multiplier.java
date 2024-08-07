/*Create a class Multiplier that has a:
- Constructor public Multiplier(int number).
- Method public int multiply(int number) which returns the value number passed to it multiplied by the number provided to the constructor.
- You also need to create an instance variable in this exercise.
*/

public class Multiplier {
    private int number; // instance variable

    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int number) {
        return number * this.number;
    }
}

/* public class main {
    public static void main(String[] args) {
        Multiplier multiplyByThree = new Multiplier(3);

            System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));

        Multiplier multiplyByFour = new Multiplier(4);

            System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
            System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
            System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
    }
}*/
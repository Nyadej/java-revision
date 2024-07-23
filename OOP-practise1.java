/*Write a program that:
Creates an account named "Matthews account" with the balance 1000
Creates an account named "My account" with the balance 0
Withdraws 100.0 from Matthew's account
Deposits 100.0 to "my account"
Prints both the accounts*/
public class Main {
    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthew's account", 1000.0);
        Account myAccount = new Account("My account", 0.0);

        matthewsAccount.withdraw(100.0);
        myAccount.deposit(100.0);

        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}

/* Create a class named Room. Add the variables private String code and private int seats to the class. 
Then create a constructor public Room(String classCode, int numberOfSeats) through which values are assigned to the instance variables.
*/
public class Room {
    private String code;
    private int seats;

    public Room(String classCode, int numberOfSeats){
        this.code = classCode;
        this.seats = numberOfSeats;
    }

/*Create a class named Whistle. Add the variable private String sound to the class. 
After that, create the constructor public Whistle(String whistleSound), which is used to create a new whistle that's given a sound.
Then create the method public void sound() that prints the whistle's sound. */
public class Whistle {
    private String sound; 

    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }

    // Method to print the sound
    public void sound() {
        System.out.println(this.sound);
    }

    public static void main(String[] args) {
        // Creating instances of Whistle with different sounds
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        // Calling the sound method on the instances
        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}

/* Create a class named Door. 
The door does not have any variables. 
Create for it a constructor with no parameters (or use the default constructor). 
After that, create a public void knock() method for the door that prints the message "Who's there?" when called.
 */
public class Door {

    // default constructor
    public Door(){
        // no initialisation required
    }

    // method to print the message when the door is knocked
    public void knock() {
        System.out.println("Who's there?");
    }

    // main method to test the door class
    public static void main(String[] args) {
        Door alexander = new Door();

        alexander.knock();
        alexander.knock();
    }
}

/*
Create a class Product that represents a store product. 
The product should have a price (double), a quantity (int) and a name (String).

The class should have:

the constructor public Product (String initialName, double initialPrice, int initialQuantity)
a method public void printProduct() that prints product information in the following format:
Sample output - Banana, price 1.1, 13 pcs
 */
public class Product {
    private double price; 
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuantity){
        this.price = initialPrice; 
        this.quantity = initialQuantity;
        this.name = initialName;
    }

    // method to print the product information
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }

    // main method to test the product class
    public static void main(String[] args) {
        Product banana = new Product("Banana", 1.1, 13);

        // print the product information 
        banana.printProduct();
    }
}

public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        if (this.value > 0) {
            this.value = this.value - 1;
        }
    }

    public class MainProgram {
        public static void main(String[] args) {
            DecreasingCounter counter = new DecreasingCounter(10);
    
            counter.printValue();
    
            counter.decrement();
            counter.printValue();
    
            counter.decrement();
            counter.printValue();
        }
    }
}
/*
1. Create a class Statistics that has the following functionality (the file for the class is provided in the exercise template):
- a method addNumber adds a new number to the statistics
- a method getCount tells the number of added numbers

The class does not need to store the added numbers anywhere, it is enough for it to remember their count. 
At this stage, the addNumber method can even neglect the numbers being added to the statistics, since the only thing being stored is the count of numbers added.
 
2. Expand the class with the following functionality:
- the sum method tells the sum of the numbers added (the sum of an empty number statistics object is 0)
- the average method tells the average of the numbers added (the average of an empty number statistics object is 0
*/

public class Statistics {
    private int count;
    private int sum;

    // constructor initialises the count to 0
    public Statistics(int count) {
        this.count = 0;
        this.sum = 0;
    }

    // increment the count each time a number is added
    public void addNumber(int number) {
        this.count++; // incrementation
        this.sum += number; // add the number to the sum
    }

    // return the current count of numbers added
    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    // return the average of the numbers added
    public double average() {
        // avoid division by zero
        if (this.count == 0) {
            return 0;
        } else {
            return (double) this.sum / this.count; 
        }
    }
}

/*MAIN METHOD: 
 * 
 * public class MainProgram {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
    }
}
    PRINTS 4

MAIN METHOD FOR EXERCISE 2:

    public class Main {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}

 */
/*
Implement a class called Counter. The class contains a number whose value can be incremented and decremented. The class must have the following constructors:

public Counter(int startValue) sets the start value of the counter to startValue.

public Counter() sets the start value of the counter to 0.

And the following methods:

public int value() returns the current value of the counter
public void increase() increases the value by 1
public void decrease() decreases the value by 1
 */

public class Counter {
    private int currentValue;

    public Counter (int startValue) {
        this.currentValue = startValue;
    }

    public Counter() { 
        this.currentValue = 0;
    }

    public int value() {
        return this.currentValue;
    }

    public void increase() {
        this.currentValue++;
    }

    public void decrease() {
        this.currentValue--;
    }
    public static void main(String[] args) {
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        System.out.println("Counter1 initial value: " + counter1.value()); // Should print 10
        System.out.println("Counter2 initial value: " + counter2.value()); // Should print 0

        counter1.increase();
        counter2.decrease();

        System.out.println("Counter1 value after increase: " + counter1.value()); // Should print 11
        System.out.println("Counter2 value after decrease: " + counter2.value()); // Should print -1
    }
 }

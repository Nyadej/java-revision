/*
public Timer() creates a new timer.
public String toString() returns a string representation of the timer. The string representation should be in the form "seconds: hundredths of a second", where both the seconds and the hundredths of a second are represented by two numbers. For example, "19:83" would represent the time 19 seconds, 83 hundredths of a second.
public void advance() moves the timer forward by a hundredth of a second.
 */

public class Timer {
    private ClockHand hundredthsOfSecond; 
    private ClockHand seconds;

    public Timer() {
        this.hundredthsOfSecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public String toString() {
        return this.seconds + ":" + this.hundredthsOfSecond;
    }

    public void advance() {
        this.hundredthsOfSecond.advance();
        if (this.hundredthsOfSecond.value() == 0) {
            this.seconds.advance();
        }
    }
}



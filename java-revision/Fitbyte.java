/*
The Karvonen method allows you to calculate your target heart rate for physical exercise. 
The target heart rate is calculated with the formula (maximum heart rate - resting heart rate) * (target heart rate percentage) + resting heart rate, where the target heart rate is given as a percentage of the maximum heart rate.

Create a class called Fitbyte. Its constructor takes both an age and a resting heart rate as its parameters. 
The exercise assistant should provide a method targetHeartRate, which is passed a number of type double as a parameter that represents a percentual portion of the maximum heart rate. The proportion is given as a number between zero and one. 
The class should have:
- A constructor public Fitbyte(int age, int restingHeartRate)
- A method public double targetHeartRate(double percentageOfMaximum) that calculates and returns the target heart rate.
 */

public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte (int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) { 
        double maxHeartRate = 206.3 - (0.711 * age);
        return (maxHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }
}

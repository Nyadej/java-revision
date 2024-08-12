package exceptions;
/*
Create a class called StandardSensor that implements the interface Sensor.
A standard sensor is always on. Calling the methods setOn and setOff have no effect. 
The StandardSensor must have a constructor that takes one integer parameter. 
he method call read returns the number that was given to the constructor.
 */

public class StandardSensor implements Sensor {
    private boolean isOn = true;
    private int read;

    public StandardSensor (int read) {
        this.read = read;
    }

    public int read() {
        return read;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {

    }

    public void setOff() {

    }
}



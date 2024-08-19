package exceptions;

public class AverageSensor implements Sensor {
    private boolean isOn = true;
    private int read;

    public StandardSensor (int read) {
        this.read = read;
    }

    @Override
    public int read() {
        return read;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        
    }

    @Override
    public void setOff() {

    }

    public void addSensor(Sensor toAdd) {

    }
}

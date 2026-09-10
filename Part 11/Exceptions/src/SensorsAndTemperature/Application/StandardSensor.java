package SensorsAndTemperature.Application;

public class StandardSensor implements Sensor{
    private int value;
    private boolean status;

    public StandardSensor(int val) {
        this.value = val;
        this.status = true;
    }

    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        if(!isOn()) {
            throw new IllegalArgumentException("Sensor must be on");
        }

        return value;
    }
}

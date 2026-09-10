package SensorsAndTemperature.Application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    Random random;
    private boolean status;

    public TemperatureSensor() {
        status = false;
        random = new Random();
    }

    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {
        status = true;
    }

    @Override
    public void setOff() {
        status = false;
    }

    @Override
    public int read() {
        if(!isOn()) {
            throw new IllegalArgumentException("Sensor must be on");
        }
        int num = random.nextInt(61);
        return num - 30;
    }
}

package SensorsAndTemperature.Application;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor tempSensor = new TemperatureSensor();

        tempSensor.setOn();
        System.out.println(tempSensor.read());
    }
}

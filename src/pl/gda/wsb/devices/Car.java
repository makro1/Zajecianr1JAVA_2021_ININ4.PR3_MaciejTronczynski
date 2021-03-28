package pl.gda.wsb.devices;

import pl.gda.wsb.CarProducer;

public class Car {
    final String model;
    private final pl.gda.wsb.CarProducer CarProducer;
    int vMax;
    double engineCapacity;
    double value;

    public Car(String model, pl.gda.wsb.CarProducer producer, int vMax, double engineCapacity, double value) {
        this.model = model;
        this.CarProducer = producer;
        this.vMax = vMax;
        this.engineCapacity = engineCapacity;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", CarProducer=" + CarProducer +
                ", vMax=" + vMax +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}

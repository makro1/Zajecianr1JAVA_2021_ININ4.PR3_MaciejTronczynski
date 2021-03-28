package pl.gda.wsb.devices;

import pl.gda.wsb.CarProducer;

public class Car {
    final String model;
    private final pl.gda.wsb.CarProducer CarProducer;
    int vMax;
    double engineCapacity;

    public Car(String model, pl.gda.wsb.CarProducer producer, int vMax, double engineCapacity) {
        this.model = model;
        this.CarProducer = producer;
        this.vMax = vMax;
        this.engineCapacity = engineCapacity;
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

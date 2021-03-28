package pl.gda.wsb;

public class Car {
    final String model;
    String producer;
    int vMax;
    double engineCapacity;

    public Car(String model, String producer, int vMax, double engineCapacity) {
        this.model = model;
        this.producer = producer;
        this.vMax = vMax;
        this.engineCapacity = engineCapacity;
    }
}

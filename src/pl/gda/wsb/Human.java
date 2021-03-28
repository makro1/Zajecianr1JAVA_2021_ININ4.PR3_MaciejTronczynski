package pl.gda.wsb;

import pl.gda.wsb.devices.Car;

import java.util.Objects;

public class Human {
    public String name;
    public int age;
    public int height;
    Animal pet;
    Car car;


    public Human(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && height == human.height && Objects.equals(name, human.name) && Objects.equals(pet, human.pet) && Objects.equals(car, human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, pet, car);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}

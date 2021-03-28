package pl.gda.wsb;

import java.util.Date;

import pl.gda.wsb.devices.Car;

import java.util.Objects;

public class Human {
    public String name;
    public int age;
    public int height;
    private Double salary;
    Animal pet;
    Car car;

    public Double getSalary() {
        Date nowDate = new Date();
        System.out.println("Wypłata była pobrana: " + nowDate);
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary <= 0 ){
            System.out.println("Wypłata nie może być ujemna!");
        }else
            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Odbierz aneks od pani Hani :)");
            System.out.println("ZUS już wie!");
            System.out.println("Twoja nowa wypłata wynosi: " + salary);

            this.salary = salary;
    }

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

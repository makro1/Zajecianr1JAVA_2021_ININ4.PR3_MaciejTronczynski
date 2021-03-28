package pl.gda.wsb;

public class Animal {

    public String name;
    public int age;
    public int height;
    public boolean haveTail;
    final String species;
    double weight;

    public static final Double DEAFAULT_MOUSE_WEIGHT = 1.0;
    public static final Double DEAFAULT_DOG_WEIGHT = 20.0;
    public static final Double DEAFAULT_CAT_WEIGHT = 7.0;
    public static final Double DEAFAULT_WEIGHT = 1.0;

    public Animal(String name,
                  int age,
                  int height,
                  boolean haveTail, String species, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.haveTail = haveTail;
        this.species = species;
        this.weight = weight;

        if (species.equals("Mysz")) {
            this.weight = DEAFAULT_MOUSE_WEIGHT;
        } else if (species.equals("Pies")) {
            this.weight = DEAFAULT_DOG_WEIGHT;
        } else if (species.equals("Kot")) {
            this.weight = DEAFAULT_CAT_WEIGHT;
        } else
            this.weight = weight;

    }

    void feed() {
        if (weight <= 0) {
            System.out.println("Zwierzę zdechło");
        } else {
            weight++;
            System.out.println("+1kg");
        }
    }

    void takeForAWalk() {
        weight--;
        if (weight <= 0) {
            System.out.println("Zwierzę zdechło");
        } else
            System.out.println("-1kg");
    }
}

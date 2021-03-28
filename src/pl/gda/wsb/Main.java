package pl.gda.wsb;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {


        Animal animal1 = new Animal("Pies", 2, 50, true, "Pies", 30);
        Animal animal2 = new Animal("Kot", 2, 20, true, "Kot", 10);
        Animal animal3 = new Animal("Mysz", 1, 1, true, "Mysz", 1);
        System.out.println(animal1);
        System.out.println(animal1.name);
        System.out.println(animal1.haveTail);
        Human human1 = new Human("Edek", 50, 180);
        Human human2 = new Human("Mariola", 50, 155);
        Human human3 = new Human("Julek", 50, 170);

       /* if (animal1.height > animal2.height) {
            System.out.println(animal1.name + " jest wyższy od " + animal2.name);
        }

        if (human2.height > human1.height) {
            System.out.println(human2.name + " jest wyższy/a od " + human1.name);
        } else {
            System.out.println(human1.name + " jest wyższy/a od " + human2.name);
        }*/

        // StringBuilder humanWithMaxHeightDescription = new StringBuilder()
        //      .append("The tallest person: ")
        //    .append(humanWithMaxHeight.name)


        /*System.out.println();
        ArrayList<Human> humansList = new ArrayList();
        humansList.add(human1);
        humansList.add(human2);
        humansList.add(human3);

        for (Human human : humansList) {
            System.out.println(human.name + " " + human.age + " " + human.height);

            FileWriter fw = new FileWriter("human.txt", true);
            fw.write(human.name + " " + human.age + " " + human.age + "\n");
            fw.close();
        }*/
        animal1.feed();
        System.out.println(animal1.weight);
        animal3.feed();
        System.out.println(animal3.weight);
        animal3.takeForAWalk();
        animal3.takeForAWalk();
        System.out.println();
        System.out.println();
        System.out.println();

        Car car1 = new Car("Octavia", "Skoda", 200, 2.0);










    }
}

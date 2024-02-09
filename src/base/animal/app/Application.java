package base.animal.app;
import base.animal.data.*;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        new Application().start();

    }

    private void start() {
        AnimalController controller = new AnimalController();
        Animal testDyr1 = new Animal("Horsey the scared horse", 14);
        Animal testDyr2 = new Animal("Lise", "Kat", "likes to sleep?",  27);
        Animal testDyr3 = new Animal("Marcus", "Hund", "likes to eat", 1, true, false);
        controller.createAnimal(testDyr1);
        controller.createAnimal(testDyr2);
        controller.createAnimal(testDyr3);
        List<Animal> animals = controller.getAllAnimals();
        for (Animal ani : animals) {
            System.out.println(ani + "\n");
        }
        // Animal testDyr4 = new Animal("Horsey the scared horse", 14);
//        System.out.println("animal 1" + testDyr1);
//        System.out.println("animal 2" + testDyr2);
//        System.out.println("animal 3" + testDyr3);
    }
}

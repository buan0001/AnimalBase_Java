package base.animal.app;
import base.animal.data.*;

import java.util.Collection;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        new Application().start();

    }

    private void start() {
        AnimalController controller = new AnimalController();
        InitData dataStarter = new InitData(controller);
        dataStarter.startData();
        List<Animal> animals = controller.getAllAnimalsSorted((a,b) -> a.getName().compareTo(b.getName));
        //List<Animal> animals = controller.getAllAnimalsSorted(new AnimalNameComparator().reversed());
        
        for (Animal ani : animals) {
            System.out.println(ani + "\n");
        }
        // Animal testDyr4 = new Animal("Horsey the scared horse", 14);
//        System.out.println("animal 1" + testDyr1);
//        System.out.println("animal 2" + testDyr2);
//        System.out.println("animal 3" + testDyr3);
    }
}

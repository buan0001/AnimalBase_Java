package base.animal.app;
import base.animal.data.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalController {
    HashMap<Integer, Animal> animalMap = new HashMap<>();
    private int idCount = 1;
    public Animal createAnimal(Animal recievedAnimal) {
        Animal newAnimal = new Animal(recievedAnimal);
        newAnimal.setId(idCount);
        idCount++;
        animalMap.put(idCount, newAnimal);
        return newAnimal;
    }

    public List<Animal> getAllAnimals() {
        List<Animal> listOfAnimals = new ArrayList<>();
        for (Map.Entry<Integer, Animal> entry : animalMap.entrySet() ) {
            listOfAnimals.add(entry.getValue());
        }
        return listOfAnimals;
    }


//    public String toString() {
//        return Animal.toString();
//    }
}

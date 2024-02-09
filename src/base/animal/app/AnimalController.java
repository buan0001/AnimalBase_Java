package base.animal.app;
import base.animal.data.*;

import java.sql.Array;
import java.util.*;

public class AnimalController {
    HashMap<Integer, Animal> animalMap = new HashMap<>();
    private int idCount = 1;
    public Animal createAnimal(Animal recievedAnimal) {
        Animal newAnimal = new Animal(recievedAnimal);
        newAnimal.setId(idCount);
        idCount++;
        animalMap.put(newAnimal.getId(), newAnimal);
        return newAnimal;
    }

    public List<Animal> getAllAnimals() {
        return new ArrayList<>(animalMap.values());
    }

    public Collection<Animal> getAllAnimalsSorted() {
       return new TreeSet<>(animalMap.values());
    }
    public List<Animal> getAllAnimalsSorted(Comparator comp) {
        List<Animal> liste =  new ArrayList<>(animalMap.values());
        liste.sort(comp);
        return liste;
    }

}

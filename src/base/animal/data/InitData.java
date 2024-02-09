package base.animal.data;

import base.animal.app.AnimalController;

public class InitData {
    private AnimalController controller;

    public InitData(AnimalController controller) {
        this.controller = controller;
    }

    public void startData() {

        controller.createAnimal(new Animal("Lise", "Kat", "likes to sleep?",  27));
        controller.createAnimal(new Animal("Horsey the scared horse", 14));
        controller.createAnimal(new Animal("Marcus", "Hund", "likes to eat", 1, true, false));
    }

}

public class Application {
    public static void main(String[] args) {
        new Application().start();

    }

    private void start() {
        Animal testDyr1 = new Animal("Horsey the scared horse", 14);
        Animal testDyr2 = new Animal("Lise", "Kat", "likes to sleep?",  27);
        Animal testDyr3 = new Animal("Marcus", "Hund", "likes to eat", 1, true, false);
        // Animal testDyr4 = new Animal("Horsey the scared horse", 14);
        System.out.println("animal 1" + testDyr1);
        System.out.println("animal 2" + testDyr2);
        System.out.println("animal 3" + testDyr3);
    }
}

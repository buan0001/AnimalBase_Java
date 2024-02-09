package base.animal.data;

public class Animal {
    private int id;
    private String name;
    private String type;
    private String description;
    private int age;
    private boolean star = false;
    private boolean winner = false;

    public Animal() {
    }


    public Animal(String name, String type, String description, int age, boolean star, boolean winner) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.age = age;
        this.star = star;
        this.winner = winner;
    }

    public Animal(Animal otherAnimal) {
        this.name = otherAnimal.name;
        this.type = otherAnimal.type;
        this.description = otherAnimal.description;
        this.age = otherAnimal.age;
        this.star = otherAnimal.star;
        this.winner = otherAnimal.winner;
    }

    public Animal(String nameDescriptionTypeParts, int age) {
        String[] splitAnimal = nameDescriptionTypeParts.split(" ");
        this.name = splitAnimal[0];
        if (splitAnimal[1].equals("the")) {
            this.description = splitAnimal[2];
            this.type = splitAnimal[3];

        }
        else {
            this.description = splitAnimal[1];
            this.type = splitAnimal[2];
        }
        this.age = age;
    }

    public Animal(String name, String type, String description, int age) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.age = age;
    }

    public String toString() {
        return "Id: " + id + "\nName: " + name + "\nType: " + type + "\nDescription: " + description + "\nAge: " + age + "\nStar: " + star + "\nWinner: " + winner + "\n";
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class DogOwner {
    private final String name;
    private final String gender;
    private Dog dog;

    public DogOwner(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void changeNameDog(String newName) {
        this.dog.name = newName;
    }

    public void increaseAgeDog() {
        this.dog.age++;
    }

    public String toString() {
        return name + " has a dog called '" + dog.name + "'. " + dog.name + " is a " + dog.sex + " " + dog.breed + " of " + dog.age + " years old.";
    }
}

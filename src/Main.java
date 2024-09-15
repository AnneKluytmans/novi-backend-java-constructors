public class Main {
    public static void main(String[] args) {
        //Creating and printing house objects
        House houseOne = new House();
        House houseTwo = new House("Mooi vrijstaand huis", 534, 553000);
        Address addressThree = new Address("Dorpsstraat", "Leeuwarden", "3568AB", 5);
        House houseThree = new House(addressThree, "Rijtjeswoning vlakbij het centrum", 8, true, 145, 345000);

        System.out.println("House one: " + houseOne.toString());
        System.out.println("House two: " + houseTwo.toString());
        System.out.println("House three: " + houseThree.toString());

        //Creating and printing dog/ dog owner objects
        Dog dogJan = new Dog("Golden Retriever", "female", "Millie", 8);
        Dog dogAnne = new Dog("Toller", "Male", "Beer", 3);

        DogOwner jan = new DogOwner("Jan", "male");
        DogOwner anne = new DogOwner("Anne", "female");

        jan.setDog(dogJan);
        anne.setDog(dogAnne);

        System.out.println(jan.toString());
        System.out.println(anne.toString());

        jan.increaseAgeDog();
        anne.changeNameDog("Koos");

        System.out.println(jan.toString());
        System.out.println(anne.toString());
    }
}
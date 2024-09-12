public class Main {
    public static void main(String[] args) {
        House houseOne = new House();
        House houseTwo = new House("Mooi vrijstaand huis", 534, 553000);
        Address addressThree = new Address("Dorpsstraat", "Leeuwarden", "3568AB", 5);
        House houseThree = new House(addressThree, "Rijtjeswoning vlakbij het centrum", 8, true, 145, 345000);

        System.out.println("House one: " + houseOne.toString());
        System.out.println("House two: " + houseTwo.toString());
        System.out.println("House three: " + houseThree.toString());
    }
}
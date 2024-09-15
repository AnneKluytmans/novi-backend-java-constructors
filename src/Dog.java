public class Dog {
    public final String breed;   //final means you can not change the value after initialization
    public final String sex;
    public String name;
    public int age;

    public Dog(String breed, String sex, String name, int age) {
        this.breed = breed;
        this.sex = sex;
        this.name = name;
        this.age = age;
    }
}

public class Address {
    public String street;
    public String city;
    public String zipcode;
    public int houseNumber;

    public Address(String street, String city, String zipcode, int houseNumber) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.houseNumber = houseNumber;
    }

    public String toString() {
        return this.street + " " + this.city + " " + this.zipcode + " " + this.houseNumber;
    }
}

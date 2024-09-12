public class House {
    //Properties
    public Address address;
    public String description;
    public int amountOfRooms;
    public boolean isSmokingAllowed;
    public int area;
    public double price;

    //Constructors
    public House() {
        this.description = "unknown";  //bij aanmaak van een instantie wordt nu automatisch deze waarde meegegeven als description
    }

    public House(String description, int area, double price) {
        this.description = description;
        this.area = area;
        this.price = price;
    }

    public House(Address address, String description, int amountOfRooms, boolean isSmokingAllowed, int area, double price) {
        this.address = address;
        this.description = description;
        this.amountOfRooms = amountOfRooms;
        this.isSmokingAllowed = isSmokingAllowed;
        this.area = area;
        this.price = price;
    }


    //Methods
    public String toString() {
        return "- Adress: " + this.address + " - Description: " + this.description + " - Amount of rooms: " + this.amountOfRooms + " - Smoking: " + this.isSmokingAllowed +
                " - Area: " + this.area + "m2 - Price: €" + this.price;
    }
}



class Address {
    private String city;
    private int house;
    private int street;

    public Address() {
        city = "";
        house = 0;
        street = 0;
    }

    public Address(String city, int house, int street) {
        this.city = city;
        this.house = house;
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;

    }

    public void setHouse(int house) {
        this.house = house;

    }

    public void setStreet(int street) {
        this.street = street;

    }

    public String getCity() {
        return city;
    }

    public int getHouse() {
        return house;
    }

    public int getStreet() {
        return street;
    }

    public void display() {
        System.out.println("City: " + this.city);
        System.out.println("House: " + this.house);
        System.out.println("Street: " + this.street);
    }

}

class Person {
    protected String name;
    protected Address Ad;

    public Person() {
        name = "";
        Ad = null;
    }

    public Person(String name, Address a) {
        this.name = name;
        Ad = a;
    }

    void setName(String name) {
        this.name = name;

    }

    void setAd(Address a) {
        Ad = a;
    }

    public String getName(){
        return name;
    }

    public Address getAd(){
        return Ad;
    }

    public void display(){
        System.out.println("Name: " + name);
        Ad.display();
    }

}

public class Task1 {
    public static void main(String[] args) {
        Address a1 = new Address("Paris", 20, 30);
        Person s1 = new Person("John", a1);
        System.out.println(s1.getAd().getCity());
    }   
}

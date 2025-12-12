class Address{
    String city;

    Address(String city){
        this.city = city;
    }
}

class Person{
    // fields of Person class
    String name;

    // Aggregation
    Address address;  // Reference of Address class

    // Normal Constructor
    Person(String name, String address){
        this.name = name;
        this.address = new Address(address);  // Deep Copy
    }

    // Constructor for Person with Address object
    Person(String name, Address address){
        this.name = name;
        this.address = address;  // Shallow Copy
    }
}

// When HAS-A relation Use Aggregation ex., Person has a address
// When IS-A relation Use Inheritance  ex., Cat is a type of animal
public class Aggregation {

    public static void main(String[] args) {

        // Creating address objects
        Address address = new Address("Mumbai");
        Address address2 = new Address("Pune");

        // Creating Person object
        // We pass address object as second parameter
        Person p1 = new Person("Ravi", address2);
        Person p2 = new Person("Harsh", address);


        System.out.println(p1.name + " lives in " + p1.address.city);
        System.out.println(p2.name + " lives in " + p2.address.city);
    }
    
}

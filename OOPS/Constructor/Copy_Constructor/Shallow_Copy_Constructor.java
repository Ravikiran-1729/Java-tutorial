class Address{
    String city;

    Address(String city){
        this.city = city;
    }
}

class Person{
    String name;

    Address address;  //mutable object

    // Normal Constructor
    Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    //Copy Constructor
    Person(Person p){
        this.name = p.name;         // primitive / immutable copy
        this.address = p.address;   // Shallow Copy (Same reference / same pointer address)
    }
}

public class Shallow_Copy_Constructor {
    public static void main(String[] args) {
        Address address = new Address("Mumbai");

        Person p1 = new Person("Ravi", address);

        Person p2 = new Person(p1);  // shallow Copy
        
        (p1.address).city = "Pune";  // Change city in Copied Object

        System.out.println("Orignal :- " + p1.address.city);  // pune (changed!)
        System.out.println("Copied :- " + p2.address.city);   // pune (affected! [Shares same copy over multiple objects])
    }
}
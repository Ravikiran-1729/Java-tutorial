class Address{
    String city;
    
    Address(String city){
        this.city = city;
    }
}

class Person{
    String name;
    Address address; //mutable object


    // Normal Constructor
    Person(String name, Address address){
        this.name = name;
        this.address  = address;
    }

    // Deep Copy Constructor
    Person(Person p){
        this.name = p.name;      // copy Primitive / immutable 

        // Never shares same copy over multiple objects where Create new object
        this.address = new Address(p.address.city);   // Deep Copy (new object) 
    }
}

public class Deep_Copy_Constructor {
    public static void main(String[] args) {
        Address address = new Address("Mumbai");

        Person p1 = new Person("Ravi", address);

        Person p2 = new Person(p1);

        p1.address.city = "Pune";

        System.out.println("Orignal (changed):- " + p1.address.city);  // pune (changed!)

        // Never shares same copy over multiple objects where Create new object
        System.out.println("Copied :- " + p2.address.city);   // Mumbai (Not affected!) 
    }
}

class Vehicle{
    Vehicle(){
        System.out.println("\nYour are Creating Vehicles");
    }
}

class Car extends Vehicle{
    String model;
    int year;

    // Default Constructor
    Car(){
        this("Default Model"); // calls Single Parameterized Constructor
        System.out.println("Default Constructor Called");
    }
    
    // Single Parameterized Constructor
    Car(String model){
        this(model, 2020);   // calls Two Parameterized Constructor
        System.out.println("Single parameterized Constructor Called");
    }
    
    // Two Parameterized Constructor
    Car(String model, int year){
        super(); // calls Vehicle constructor
        this.model = model;
        this.year = year;
        System.out.println("Two parameterized Constructor Called");
    }

    public void display(){ 
        System.out.println("\nModel: " + model + ", Year: " + year);
    }
}





public class Constructor_chaining {
    public static void main(String[] args) {
        Car c1 = new Car();

        Car c2 = new Car("Legend");

        Car c3 = new Car("Leader Edition", 2025);

        c1.display();
        c2.display();
        c3.display();
    }
}

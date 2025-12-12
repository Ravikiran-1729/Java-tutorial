final class Vehicle{
    void run(){
        System.out.println("Vehicle runs");
    }
}

// ERROR : Cannot inherit from final Vehicle
/* 

class Car extends Vehicle{ }

*/

public class Final_Class {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();
    }
}

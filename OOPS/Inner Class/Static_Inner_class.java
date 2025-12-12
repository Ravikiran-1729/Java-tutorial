class OuterClass{

    private int instanceVar = 10;
    private static int staticVar = 20;

    // Static inner class
    // 1. Does NOT need an instance of OuterClass.
    // 2. Can have MULTIPLE independent instances, just like any normal class.
    static class InnerClass{
        String city ;

        // Constructor to initialize city
        InnerClass(String city){
            this.city = city;
        }

        // Method to display the city name
        public void getCity(){
            System.out.println("City is :- " + city);
        }

        void show(){
            // Error: Cannot access instance variables of outer class
            // System.out.println(instanceVar); 

            System.out.println(staticVar);  // OK (20)
        }

    }
}


public class Static_Inner_class {
    public static void main(String[] args) {

        // Creating multiple independent instances of static inner class
        // Static inner classes behave like normal top-level classes
        // so they support multiple objects.
        OuterClass.InnerClass MyObj1 = new OuterClass.InnerClass("Pune");
        OuterClass.InnerClass MyObj2 = new OuterClass.InnerClass("Mumbai");

        MyObj1.getCity(); // Pune
        MyObj2.getCity(); // Mumbai 
    }
}

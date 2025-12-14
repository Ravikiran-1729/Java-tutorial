// Normal class
class Animal {

    // Instance method
    void sound(){
        System.out.println("Animal Sounds");
    }
}

public class AnonymousClass {

    public static void main(String[] args) {

        // -----------------------------------------
        // Anonymous Inner Class
        // -----------------------------------------
        // ✔ No class name
        // ✔ Used to override methods on the spot
        // ✔ Created at the time of object creation
        // ✔ Used when a class is required only once

        Animal dog = new Animal() {

            // Overriding method of Animal class
            @Override
            public void sound(){
                System.out.println("Dog Barks");
            }
        };

        // Calls overridden method of anonymous class
        dog.sound();
    }
}

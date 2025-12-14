class Animal{
    public void sound(){
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println(
            "Dog Barks"
        );
    }

    public void run(){
        System.out.println("Dog runs using 4 legs");
    }
}

public class Base_Derived_Class_Reference {

    public static void main(String[] args) {

        
        Animal a = new Dog();

        a.sound();   // "Dog Barks" -> Overridding
//       a.run();    // Error :- Animal Doesn't have run()




        Dog d = new Dog();

        d.sound();  // "Dog Barks" -> Overridding
        d.run();    // Dog runs using 4 legs
    }
}
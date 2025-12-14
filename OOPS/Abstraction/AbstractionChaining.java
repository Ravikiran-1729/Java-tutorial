abstract class Animal{
    abstract void walks();

    public void eat(){
        System.out.println("Animal can Eat");
    }

    Animal(){
        System.out.println("Your are creating Animal");
    }
}

class Horse extends Animal{
    public void walks(){
        System.out.println("Animal can walk on 4 legs");
    }

    Horse(){
        System.out.println("You are creating Horse");
    }

}
public class AbstractionChaining{
    public static void main(String[] args) {
        Horse h1 = new Horse();

        h1.eat();

        /*Here Above you just created h1 Object using Horse() Constructor 
        But as you can See we have one parent class - Animal which is Abstract class
        And One another which is Child class :- Horse in which we inherited the Animal abstract class
        So when we create Horse object using Horse() Constructor 
        It goes to the Horse class Horse() constructor and from that it goes to the parent class and search for the any Constructor 
        If exist then firstly it run that Constructor (here Animal() constructor in the Animal abstract class)
        and then comes on Horse() Constructor and run it 
        As the Abstraction Chain works.

        so --!-- Output is :---

        Your are creating Animal
        You are creating Horse
        Animal can Eat

        
         */
    }
}
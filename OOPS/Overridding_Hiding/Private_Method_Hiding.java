class Parent {
    Parent() {
        name();    // Calls Parent version
        normal();  // Calls overridden version
    }

    private void name() {
        System.out.println("This is private method of parent class");
    }

    public void normal() {
        System.out.println("This is normal public method of parent class");
    }
}

class Child extends Parent {

    // Private methods are never inherited; since they cannot be overridden, they are just hidden
    private void name() {   // Hidden (not overridden)
        System.out.println("This is private method of child class");
    }

    // Overridden public method
    @Override
    public void normal() {
        System.out.println("This is normal public method of child class");
    }


    public void run(){
        name();
    }
}

public class Private_Method_Hiding {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.run();
    }
}

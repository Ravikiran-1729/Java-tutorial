
class Base{
    int a;

    // Parameterized Constructor
    Base(int a){
        this.a = a;
        System.out.println("Base Constructor Called :- a = "+a);
    }
}

class Derived extends Base{
    int b;

    // Parameterized Constructor
    Derived(int a, int b){
        super(a);  // Calling Base(int a)
        this.b = b;
        System.out.println("Derived Constructor Called :- b = "+b);
    }
}


public class Parameterized_Constructor_Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived(29, 17);
    }
}

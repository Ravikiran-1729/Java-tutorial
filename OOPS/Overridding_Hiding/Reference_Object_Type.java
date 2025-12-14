class ParentClass {
    int x = 29;
}

class ChildClass extends ParentClass {
    int x = 17;
}

public class Reference_Object_Type {
    public static void main(String[] args) {
        ChildClass ch = new ChildClass();
        ParentClass ch1 = new ChildClass();

        System.out.println("Child Reference: x = " + ch.x);
        // Output: 17 (Accessed using ChildClass reference)

        System.out.println("Parent Reference: x = " + ch1.x);
        // Output: 29 (Accessed using ParentClass reference)
    }
}
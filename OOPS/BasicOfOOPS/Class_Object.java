//Class (public/abstract/final & by default 'default')
class NewClass{
    //Class Attribute
    int x = 10;

    //final class attribute
    //final attributes are Never Modify
    final String str = "This is class attribute";

    //Class Methods
    void class_Method(){
        System.out.println("This is class Method");
    }

    static void static_class_method(){
        System.out.println("This is class Method(Static");
    }


    // Class Constructor
    NewClass(){
        System.out.println("This is class constructor");
    }


}


public class Class_Object {
    public static void main(String[] args) {

        // Class Object 
        // format : Reference_type Obj_name = new Object_type;
        NewClass Obj1 = new NewClass();
        NewClass Obj2 = new NewClass();

        Obj2.x = 20;

        // It will give Error: cannot assign a value to final variable str
        // Obj2.str = "Trying to modify final string"; 


        System.out.println("x :- " + Obj1.x);
        System.out.println("x :- " + Obj2.x);

        // Accessing (Non-Static) Methods using Object
        Obj1.class_Method();

        // Accessing (Static) Methods using Class Name
        NewClass.static_class_method();

        
    }
}

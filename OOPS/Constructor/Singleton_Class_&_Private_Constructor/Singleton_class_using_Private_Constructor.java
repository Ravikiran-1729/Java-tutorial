class Singleton_Class{
    private static Singleton_Class class_instance = null;
    String s = "Initial value";

    private Singleton_Class(){}

    public static Singleton_Class Singleton_Class_Method(){
        if(class_instance == null){
            class_instance = new Singleton_Class();
            return class_instance;
        }else{
            return class_instance;
        }
    }
}

class Singleton_class_using_Private_Constructor {
    public static void main(String[] args) {
        Singleton_Class first_instance = Singleton_Class.Singleton_Class_Method();
        Singleton_Class second_instance = Singleton_Class.Singleton_Class_Method();

        System.out.println(first_instance.s +" "+second_instance.s);
        first_instance.s = "Changed value";
        System.out.println(first_instance.s +" "+second_instance.s);
    }
}
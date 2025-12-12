class A{
    String name;
}

public class Object_Class_Methods {
    public static void main(String[] args) {
        A a = new A();
        A b = a;

        System.out.println(a.toString());
        System.out.println( b.toString());
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(a.getClass());
    }
}

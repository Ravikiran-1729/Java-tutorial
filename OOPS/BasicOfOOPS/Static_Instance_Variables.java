class Demo{
    static int a;
    int b;
}

public class Static_Instance_Variables {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo demo1 = new Demo();


        demo.a = 10;
        demo1.a = 30;

        System.out.println("For Demo :- a = "+demo.a);    // 30 (Same for all object)
        System.out.println("For Demo1 :- a = "+demo1.a);  // 30 (Same for all object)
        System.out.println("For Demo.a :- a = "+Demo.a);  // 30 (Same for all object)

        demo.b = 99;
        demo1.b = 100;
        
        System.out.println("For Demo :- b = "+demo.b);    // 99  (Unique for a object)
        System.out.println("For Demo1 :- b = "+demo1.b);  // 100   (Unique for a object)

    }
}

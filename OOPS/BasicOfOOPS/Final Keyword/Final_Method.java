class Demo{
    final public void show(){
        System.out.println("Hello there");
    }
}


class Demo1 extends Demo{
    // This will cause an ERROR because final methods cannot be overridden
    /* 

    @Override
    public void show(){
        System.out.println("Hello I am there");

    */
}
public class Final_Method extends Demo{
    public static void main(String[] args) {
        Demo fm = new Demo1(); // Upcasting  
        fm.show();  // Calls Demo.show()
    }
}

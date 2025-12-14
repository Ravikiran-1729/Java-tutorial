class ClassParent{
    static void show(){
        System.out.println("This is Static Method of Parent class");
    }
}
class ClassChild extends ClassParent{
    static void show(){
        System.out.println("This is Static Method of Child class");
    }
}



public class Static_Method_Hiding {
    public static void main(String[] args) {
        ClassChild cc = new ClassChild();
        ClassParent cp = new ClassParent();

        cc.show();  // Child class show() -> Reference Type ClassChild
        cp.show();  // Parent class show() -> Reference Type ClassParent
    } 
}

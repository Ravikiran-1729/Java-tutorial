class Student{
    String name;
    int age;

    public void getInfo(String name){
        System.out.println(name);
    }

    public void getInfo(int age){
        System.out.println(age);
    }

    public void getInfo(String name, int age){
        System.out.println(name+" "+age);
    }

}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ravikiran";
        s1.age = 19;

        s1.getInfo(s1.name);
        s1.getInfo(s1.age);
        s1.getInfo(s1.name, s1.age);
    }
}

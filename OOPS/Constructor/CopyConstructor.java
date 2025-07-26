
class Student{
    String name;
    int age;

    // Default constructor
    Student() {
        this.name = "";
        this.age = 0;
    }

    // Copy Constructor
    Student(Student s1){
        this.name = s1.name;
        this.age = s1.age;
    }
    
    public void getInfo(){
        System.out.println(this.name+" "+this.age);
    }
}






public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ravikiran";
        s1.age = 19;

        s1.getInfo();

        Student s2 = new Student(s1);
        s2.getInfo();

    }
}

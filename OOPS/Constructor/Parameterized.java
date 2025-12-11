class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void getInfo(){
        System.out.println(this.name+" "+this.age);
    }
}


public class Parameterized{
    public static void main(String[] args) {
        Student s1 = new Student("Ravikiran", 19);

        s1.getInfo();
    }
}
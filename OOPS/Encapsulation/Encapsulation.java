class Student{
    // Combination of Data 
    String name;      
    int age;

    public void getInfo(){
        System.out.println(this.name+" "+this.age);
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Ravikiran";
        s1.age = 19;
        s1.getInfo();


        Student s2 = new Student();
        s2.name = "Ravi";
        s2.age = 18;
        s2.getInfo();
    }
}

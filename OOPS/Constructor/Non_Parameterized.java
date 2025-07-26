package Constructor;

class Student{
    String name;      
    int age;

    // Constructor Defination
    Student(){
        System.out.println("Non-Parameterized (default) Student Constructor Called");
    }
    
    public void getInfo(){
        System.out.println(this.name+" "+this.age);
    }

}


public class Non_Parameterized {
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

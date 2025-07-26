

// Class Defination
class Student{
    //Properties of class (or Data)
    String name;      
    int age;

    //Methods / functions of class          -- perform some task by using properties of class
    public void getInfo(){
        System.out.println(this.name+" "+this.age);
    }
}


public class OPPS_Basic {
    public static void main(String[] args) {
        //Obj Creation (s1)                  -- Instance of the class or iterator of class
        //syntax :- "Datatype obj_name = new Constructor"
        Student s1 = new Student();

        s1.name = "Ravikiran";
        s1.age = 19;

        //Function Call 
        s1.getInfo();


        Student s2 = new Student();
        s2.name = "Ravi";
        s2.age = 18;
        s2.getInfo();
    }
}

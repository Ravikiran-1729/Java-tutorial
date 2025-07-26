
class Shape{
    public void area(){
        System.out.println("Display Area of Shape");
    }
}

class Triangle extends Shape{
    public void area(int h, int b){
        System.out.println("Area : "+0.5*h*b);
    }
}

public class singleInheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(10, 10);
    }
}

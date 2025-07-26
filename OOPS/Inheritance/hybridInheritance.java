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

class Circle extends Shape{
    public void area(int r){
        System.out.println("Area : "+3.14*r*r);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int side){
        System.out.println("Area : "+(3/4)*side*side);
    }
}


public class hybridInheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(10, 10);

        Circle c1 = new Circle();
        c1.area();
        c1.area(7);

        EquilateralTriangle e1 = new EquilateralTriangle();
        e1.area();
        e1.area(7);
    }
}

class Shape{
    private double Area;
    final double pi = Math.PI;

    // Constructor Overloading;
    // One parameterized Constructor
    Shape(double r){
        Area = pi * r * r;
    }

    // Two parameterized Constructor
    Shape(double a, double b){
        Area = a * b;
    }

    public double getArea(){
        return Area;
    }
}


public class Constructor_overloadding {
    public static void main(String[] args) {
        Shape circle = new Shape(7);
        double areaOfCircle = circle.getArea();

        Shape rectangle = new Shape(10, 20);
        double areaOfRect = rectangle.getArea();

        System.out.println("Area of Circle :- "+areaOfCircle);
        System.out.println("Area of Rectangle :- "+ areaOfRect);
    }
    
}

import java.util.*;
public class circleArea {
    
    public static void main(String[] args) 
    {
        //Input
        Scanner sc = new Scanner(System.in);
        int Radius = sc.nextInt();
        int Diameter = 2 * Radius;
        double Area = Math.PI * Math.pow(Radius, 2);
        double Circumstance = Math.PI * Diameter;
        double halfarea = (Math.PI * Math.pow(Radius, 2) ) / 2;

        System.out.println(Radius);
        System.out.println(Diameter);
        System.out.println(Area);
        System.out.println(Circumstance);
        System.out.println(halfarea);

        sc.close();
    }
    
}
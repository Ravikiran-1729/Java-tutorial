
import java.util.*;


public class set_bit {
    public static void main(String[] args) {
        int n = 5;//0101

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a position :- ");
        int pos = sc.nextInt();

        int bitmask = 1 << pos;
        System.out.println("bitmask is :- " + bitmask);
        int a = bitmask | n; 

        System.out.println("bitmask | n is :- "+a+ " .........Where | is bitwise operator and || is logical operator");
        System.out.println(n+" is original number and number after setting bit is "+a);
        System.out.println(a + " is new number in which at " +pos+" position bit is set. means get changed by 1");

        
    }
}



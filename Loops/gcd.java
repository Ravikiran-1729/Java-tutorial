import java.util.Scanner;
import java.math.*;
public class gcd {
    public static int gcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

        if(a ==0) return b;
        if(b == 0) return a;

        int reminder = a%b;
        while(reminder != 0){
            int temp = reminder;
            reminder = b % reminder;
            b = temp;
        }
        return b;
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == 0 && b == 0){
            System.out.println("GCD is not defined for 0 & 0");
        }else{
            int gcd = gcd(a, b);
            System.out.println(gcd + " is the greatest common divisor of "+ a +" & "+ b);
        }

    }
}

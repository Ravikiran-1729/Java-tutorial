import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();

        System.out.print("Enter b = ");
        int b = sc.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("GCD is not defined for 0 & 0");
        } else {
            int gcd = greatestCommanDivisor(a, b);
            System.out.println("The greatest common divisor of " + a + " & " + b+" is "+gcd);
        }

        sc.close();
    }



    public static int greatestCommanDivisor(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0)
            return b;
        if (b == 0)
            return a;

        int reminder = a % b;
        while (reminder != 0) {
            int temp = reminder;
            reminder = b % reminder;
            b = temp;
        }
        return b;
    }
}

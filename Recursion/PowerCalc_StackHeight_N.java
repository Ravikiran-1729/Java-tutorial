import java.util.Scanner;

public class PowerCalc_StackHeight_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter a power: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Negative powers not supported in this version.");
        } else {
            int result = calculatePower(x, n);
            System.out.println(x + " to the power " + n + " is " + result);
        }

        sc.close();
    }

    public static int calculatePower(int x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        if (n == 1) return x;

        return x * calculatePower(x, n - 1);
    }
}

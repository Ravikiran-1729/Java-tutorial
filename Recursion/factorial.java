import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit :- ");
        int fact = factorial(sc.nextInt());
        System.out.println(fact);
    }
    




    public static int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}


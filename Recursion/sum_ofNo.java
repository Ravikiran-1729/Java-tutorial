import java.util.Scanner;

public class sum_ofNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int n = sc.nextInt();

        int sum = sum_ofNo(n);
        System.out.println("Sum of "+n+" Natural number is "+sum);

    }

    public static int sum_ofNo(int n){
        if(n==0){
            return 0;
        }
        return n + sum_ofNo(n-1);
    
    }
}

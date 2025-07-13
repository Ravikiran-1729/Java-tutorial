import java.util.Scanner;

public class sum_ofNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int n = sc.nextInt();

        int sum = calcSum(n);
        System.out.println("Sum of "+n+" Natural number is "+sum);

        sc.close();

    }



    public static int calcSum(int n){
        if(n==0){
            return 0;
        }
        return n + calcSum(n-1);
    
    }
}

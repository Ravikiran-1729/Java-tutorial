import java.util.Scanner;

public class fibonacci_series {
    public static void fibo(int a){
        if(a<=0){
            System.out.print("0");
            return;
        }

        int first = 0;
        int second = 1;
        System.out.print("0  1");

        if (a == 1) return;

        for(int i = 2; i< a; i++){
            int temp = first+second;
            System.out.print("  "+ temp);
            first = second;
            second = temp;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n th index number :- ");
        int a = sc.nextInt();
        System.out.print("Fibonacci Series is :- ");
        fibo(a);

        sc.close();
    }
}

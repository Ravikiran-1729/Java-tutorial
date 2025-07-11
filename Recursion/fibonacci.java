import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number:- ");
        int n = sc.nextInt();

        fibonacci(n, 0, 1);
        }

        public static void fibonacci(int n, int first , int second){
            if(n==0){
            System.out.print(first);
            return;
            }
            int third = first+second;
            System.out.print(first+"  ");
            fibonacci(n-1, second, third);
        }
}
// 0 1 1 2 3 5 8 13

// 0 1 2 3 4 5 6 7 
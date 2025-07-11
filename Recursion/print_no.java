import java.util.Scanner;


public class print_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int n = sc.nextInt();

        print_no(n, 0);
    }

    public static void print_no(int n, int i){
        if(i == n){
            System.out.print(n);
            return;
        }
        System.out.print(i+"  ");
        print_no(n, i+1);
    }
}

import java.util.Scanner;


public class print_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int n = sc.nextInt();

        printNo(n, 0);

        sc.close();
    }

    public static void printNo(int n, int i){
        if(i == n){
            System.out.print(n);
            return;
        }
        System.out.print(i+"  ");
        printNo(n, i+1);
    }
}

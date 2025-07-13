import java.util.*;

public class get_bit {
    public static void main(String[] args) {
        int n = 5;//0101

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a position :- ");
        int pos = sc.nextInt();

        int bitmask = 1 << pos;
        System.out.println("bitmask is :- "+bitmask);
        int a = bitmask & n; 

        System.out.println("bitmask & n is :- "+a+ " .........Where & is bitwise operator and && is logical operator");

        if((bitmask & n) != 0){
            System.out.println("one");
        }else{
            System.out.println("Zero");
        }

        sc.close();
    }
}

import java.util.*;

public class clear_bit {
    public static void main(String[] args) {
        int n = 5;//0101

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a position :- ");
        int pos = sc.nextInt();

        int bitmask = 1 << pos;

        int newnumber = (~ bitmask) & n;

        System.out.println(newnumber);
        
        sc.close();
    }
}

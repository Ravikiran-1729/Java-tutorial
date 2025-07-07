import java.util.*;

public class update_bit {
    public static void main(String[] args) {
        int n = 5;//0101
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a position :- ");
        int gpos = sc.nextInt();

        int gbitmask = 1<<gpos;

        if ((gbitmask & n) != 0) {
            int notgbitmask = ~gbitmask;
            int newnumber = notgbitmask & n;
            System.out.println("New number after updating bit is " + newnumber);
        } else {
            int newnumber1 = gbitmask | n;
            System.out.println("New number after updating bit is :- " + newnumber1);
        }
    }
}


// Enter a position :- 0
// New number after updating bit is 4

// Enter a position :- 1
// New number after updating bit is :- 7

// Enter a position :- 2
// New number after updating bit is 1

// Enter a position :- 3
// New number after updating bit is :- 13
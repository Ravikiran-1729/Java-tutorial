import java.util.Scanner;

public class countWaystoInviteSingPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of Guest:- ");
        int n = sc.nextInt();

        int ways = callGuests(n);
        System.out.println("Possible Ways to invite guest as single and in pair are :- "+ ways);

        sc.close();
    }

    public static int callGuests(int n){
        if(n==0||n == 1){
            return 1;
        }
        int single = callGuests(n-1);
        int pair = (n-1)*callGuests(n-2);
        return single+pair;
    }
}

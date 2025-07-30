import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class rightShiftList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter no. of right shifts :- ");
        int k = sc.nextInt();
        
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list);

        Collections.rotate(list, k);
        System.out.println(list);

        sc.close();
    }
}

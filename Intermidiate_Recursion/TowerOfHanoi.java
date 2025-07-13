
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Disk Number :- ");
        int n = sc.nextInt();

        int steps = towerOfHanoi(n, "S", "D", "H");
        
        System.out.println("\n"+n+" Disks shift from Source to Destination in "+steps+" Steps.");

        sc.close();
    }

    public static int towerOfHanoi(int n, String src, String dest, String helper) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return 1;
        } else {
            int a = towerOfHanoi(n - 1, src, helper, dest);
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            int b = towerOfHanoi(n - 1, helper, dest, src);
            return a+b+1;
        }

    }
}

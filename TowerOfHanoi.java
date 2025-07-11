import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int steps = TowerOfHanoi(n, "S", "D", "H");
        System.out.println();
        System.out.println(n+" Disks shift from Source to Destination in "+steps+" Steps.");

    }

    public static int TowerOfHanoi(int n, String src, String dest, String helper) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return 1;
        } else {
            int a = TowerOfHanoi(n - 1, src, helper, dest);
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            int b = TowerOfHanoi(n - 1, helper, dest, src);
            return a+b+1;
        }

    }
}

import java.util.HashSet;
import java.util.Scanner;

public class allPossibleSubset {
    public static HashSet<String> subsets = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n :- ");
        int n = sc.nextInt();

        // HashSet<Integer> subset = new HashSet<>();
        
        createSubset(n, 0, "");

        System.out.println(subsets);

    }

    public static void createSubset(int n, int idx, String subset){
        if(idx == n){
            subsets.add(subset);
            return;
        }

        createSubset(n, idx+1, subset+Integer.toString(idx+1)+" ");

        createSubset(n, idx+1, subset);

    }
}

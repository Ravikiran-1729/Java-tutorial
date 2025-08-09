import java.util.ArrayList;

public class SubsetSumDivisibleByK {
    public static int countSubsetsDivisibleByK(ArrayList<Integer> list, int k) {
        // dp[i] = number of subsets with sum % k == i
        int[] dp = new int[k];
        dp[0] = 1; // Empty subset has sum 0

        for (int num : list) {
            int[] newDp = dp.clone();
            System.out.println("----------------newDP after clone-------------------");
            for (int i = 0; i < k; i++) {
                int newMod = (i + num) % k;
                System.out.println(newMod + "----------------newMod");
                newDp[newMod] += dp[i]; 

                for(int j =0; j<newDp.length; j++){
                    System.out.print(newDp[j] + " ");
                }
                System.out.println("-----------------newDp");

            }
            dp = newDp;
            for(int i =0; i<dp.length; i++){
                System.out.print(dp[i] + " ");
            }
            System.err.println("-----------------dp");
        }

        // Subtract 1 to exclude the empty subset
        System.out.println(dp);
        System.out.println(dp[0]-1);
        return dp[0] - 1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int k = 5;
        System.out.println("Count of subsets divisible by " + k + " = " +
                countSubsetsDivisibleByK(arr, k));
    }
}

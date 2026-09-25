

public class PartitionEqualSubsetSum {

    private boolean canPartition(int[] vals) {
        int sum = 0;

        for (int val : vals) {
            sum += val;
        }

        if (sum % 2 != 0) {
            return false;
        }

        int subsetSum = sum / 2;

        boolean[] dp = new boolean[subsetSum + 1];

        dp[0] = true;

        for (int val : vals) {
            for (int i = subsetSum; i >= val; i--) {
                dp[i] = dp[i] || dp[i - val];
            }
            
        }

        return dp[subsetSum];
    }

    public static void main(String[] args) {
        PartitionEqualSubsetSum pess = new PartitionEqualSubsetSum();
        int vals[] = {1,2,3,4};

        boolean isPossible = pess.canPartition(vals);

        System.out.println(isPossible);
    }
}

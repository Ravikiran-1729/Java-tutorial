public class PartitionEqualSubsetSum {

    /**
     * Determines whether the array can be partitioned into two subsets with equal sum.
     * Reduces the problem to finding a subset whose sum equals (totalSum / 2).
     *
     * <p>
     * <b>Time Complexity:</b> O(n &times; subsetSum) where subsetSum = totalSum / 2<br>
     * <b>Space Complexity:</b> O(subsetSum)
     * </p>
     *
     * @param vals array of positive integers
     * @return {@code true} if an equal-sum partition exists, otherwise {@code false}
     */
    private boolean canPartition(int[] vals) {
        int sum = 0;
        for (int val : vals) {
            sum += val;
        }

        // If total sum is odd, it cannot be divided into two equal integers
        if (sum % 2 != 0) {
            return false;
        }

        int subsetSum = sum / 2;
        boolean[] dp = new boolean[subsetSum + 1];

        // Base case: A sum of 0 is always achievable with an empty set
        dp[0] = true;

        for (int val : vals) {
            // Iterate backwards to ensure each element is used at most once (0/1 DP)
            for (int i = subsetSum; i >= val; i--) {
                dp[i] = dp[i] || dp[i - val];
            }

            // Early exit if the target is already formed
            if (dp[subsetSum]) {
                return true;
            }
        }

        return dp[subsetSum];
    }

    public static void main(String[] args) {
        PartitionEqualSubsetSum pess = new PartitionEqualSubsetSum();
        int[] vals = {1, 2, 3, 5};

        boolean isPossible = pess.canPartition(vals);
        System.out.println("Can partition {1, 2, 3, 5}: " + isPossible); // Output: false

        int[] vals2 = {1, 5, 11, 5};
        System.out.println("Can partition {1, 5, 11, 5}: " + pess.canPartition(vals2)); // Output: true
    }
}
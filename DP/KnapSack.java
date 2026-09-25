import java.util.Arrays;

public class KnapSack {

    /**
     * Solves the 0/1 Knapsack problem using recursion.
     * Time Complexity  - O(2^n)
     * Space Complexity - O(n) (recursion call stack)
     *
     * @param val array containing the values of the items
     * @param wt  array containing the weights of the items
     * @param W   current remaining weight capacity of the knapsack
     * @param i   current item index being evaluated
     * @return the maximum total value achievable within the capacity
     */
    private int knapSack(int[] val, int[] wt, int W, int i) {
        if (i >= val.length) {
            return 0;
        }

        int skip = knapSack(val, wt, W, i + 1);
        int take = 0;

        if (W - wt[i] >= 0) {
            take = val[i] + knapSack(val, wt, W - wt[i], i + 1);
        }

        return Math.max(take, skip);
    }

    /**
     * Solves the 0/1 Knapsack problem using memoization (Top-Down Dynamic Programming).
     * Time Complexity  - O(n * W)
     * Space Complexity - O(n * W) + O(n) call stack
     *
     * @param val array containing the values of the items
     * @param wt  array containing the weights of the items
     * @param W   current remaining weight capacity of the knapsack
     * @param i   current item index being evaluated
     * @param dp  memoization table storing precomputed states [itemIndex][capacity]
     * @return the maximum total value achievable within the capacity
     */
    private int knapSack(int[] val, int[] wt, int W, int i, int[][] dp) {
        if (i >= val.length) {
            return 0;
        }

        if (dp[i][W] != -1) {
            return dp[i][W];
        }

        int skip = knapSack(val, wt, W, i + 1, dp);
        int take = 0;

        if (W - wt[i] >= 0) {
            take = val[i] + knapSack(val, wt, W - wt[i], i + 1, dp);
        }

        return dp[i][W] = Math.max(take, skip);
    }

    /**
     * Solves the 0/1 Knapsack problem using tabulation with space optimization (1D DP).
     * Time Complexity  - O(n * W)
     * Space Complexity - O(W)
     *
     * @time O(n * W)
     * @param val array containing the values of the items
     * @param wt  array containing the weights of the items
     * @param W   maximum weight capacity of the knapsack
     * @return the maximum total value achievable within the capacity
     */
    private int knapSack(int[] val, int[] wt, int W) {
        int[] dp = new int[W + 1]; // Primitive array defaults to 0 in Java

        for (int i = 0; i < val.length; i++) {
            for (int j = W; j >= wt[i]; j--) {
                dp[j] = Math.max(dp[j], val[i] + dp[j - wt[i]]);
            }
        }

        return dp[W];
    }

    public static void main(String[] args) {
        KnapSack ks = new KnapSack();
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;

        // Recursion
        int maxProfit1 = ks.knapSack(val, wt, W, 0);
        System.out.println("Recursion knapsack max profit: " + maxProfit1);

        // Tabulation (1D DP)
        int maxProfit2 = ks.knapSack(val, wt, W);
        System.out.println("Tabulation knapsack max profit: " + maxProfit2);

        // Memoization (Top-down DP)
        int[][] dp = new int[val.length][W + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int maxProfit3 = ks.knapSack(val, wt, W, 0, dp);
        System.out.println("Memoization knapsack max profit: " + maxProfit3);
    }
}
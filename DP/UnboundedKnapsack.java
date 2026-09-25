import java.util.Arrays;

public class UnboundedKnapsack {

    /**
     * Solves the Unbounded Knapsack problem using pure recursion.
     *
     * <p>
     * <b>Time Complexity:</b> O(2^(W + n)) in worst case<br>
     * <b>Space Complexity:</b> O(W + n) (recursion stack depth)
     * </p>
     *
     * @param vals array containing the values of the items
     * @param wt   array containing the weights of the items
     * @param W    remaining weight capacity of the knapsack
     * @param i    current item index being evaluated
     * @return the maximum value achievable within the given capacity
     */
    private int maxProfit(int[] vals, int[] wt, int W, int i) {
        // Base case: No capacity left or no items left
        if (i >= vals.length || W == 0) {
            return 0;
        }

        // Option 1: Skip the current item and move to the next
        int skip = maxProfit(vals, wt, W, i + 1);

        // Option 2: Take current item (stay at index i to allow reuse)
        int take = 0;
        if (W - wt[i] >= 0) {
            take = vals[i] + maxProfit(vals, wt, W - wt[i], i);
        }

        return Math.max(take, skip);
    }

    /**
     * Solves the Unbounded Knapsack problem using memoization (Top-Down 2D DP).
     *
     * <p>
     * <b>Time Complexity:</b> O(n &times; W)<br>
     * <b>Space Complexity:</b> O(n &times; W) + O(W + n) recursion stack
     * </p>
     *
     * @param vals array containing the values of the items
     * @param wt   array containing the weights of the items
     * @param W    remaining weight capacity of the knapsack
     * @param i    current item index being evaluated
     * @param dp   memoization table of size [items][capacity + 1]
     * @return the maximum value achievable within the given capacity
     */
    private int maxProfit(int[] vals, int[] wt, int W, int i, int[][] dp) {
        if (i >= vals.length || W == 0) {
            return 0;
        }

        if (dp[i][W] != -1) {
            return dp[i][W];
        }

        int skip = maxProfit(vals, wt, W, i + 1, dp);

        int take = 0;
        if (W - wt[i] >= 0) {
            take = vals[i] + maxProfit(vals, wt, W - wt[i], i, dp);
        }

        return dp[i][W] = Math.max(take, skip);
    }

    /**
     * Solves the Unbounded Knapsack problem using space-optimized tabulation (1D DP).
     *
     * <p>
     * <b>Time Complexity:</b> O(n &times; W)<br>
     * <b>Space Complexity:</b> O(W)
     * </p>
     *
     * @param vals array containing the values of the items
     * @param wt   array containing the weights of the items
     * @param W    maximum weight capacity of the knapsack
     * @return the maximum value achievable within the given capacity
     */
    private int maxProfit(int[] vals, int[] wt, int W) {
        int[] dp = new int[W + 1];

        for (int i = 0; i < vals.length; i++) {
            // Forward iteration enables multiple picks of the same item
            for (int j = wt[i]; j <= W; j++) {
                dp[j] = Math.max(dp[j], vals[i] + dp[j - wt[i]]);
            }
        }

        return dp[W];
    }

    public static void main(String[] args) {
        UnboundedKnapsack uks = new UnboundedKnapsack();
        int[] vals = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;

        // 1. Recursion
        int maxProfitRec = uks.maxProfit(vals, wt, W, 0);
        System.out.println("Recursion max profit: " + maxProfitRec);

        // 2. Memoization
        int[][] dp = new int[vals.length][W + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int maxProfitMemo = uks.maxProfit(vals, wt, W, 0, dp);
        System.out.println("Memoization max profit: " + maxProfitMemo);

        // 3. Tabulation (1D DP)
        int maxProfitTab = uks.maxProfit(vals, wt, W);
        System.out.println("Tabulation (1D DP) max profit: " + maxProfitTab);
    }
}
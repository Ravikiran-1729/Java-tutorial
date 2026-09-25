import java.util.Arrays;

public class CoinChange {

    /**
     * Solves Coin Change (minimum coins needed) using pure recursion.
     *
     * <p>
     * <b>Time Complexity:</b> Exponential - O(2^(amt + n))<br>
     * <b>Space Complexity:</b> O(amt + n) (recursion stack)
     * </p>
     *
     * @param coins array of available coin denominations
     * @param amt   remaining amount to make change for
     * @param i     current coin index being considered
     * @return minimum coins needed, or Integer.MAX_VALUE if impossible
     */
    private int minCoins(int[] coins, int amt, int i) {
        if (amt == 0) {
            return 0;
        }
        if (i >= coins.length) {
            return Integer.MAX_VALUE;
        }

        // Option 1: Skip this coin
        int skip = minCoins(coins, amt, i + 1);

        // Option 2: Pick this coin (can reuse same coin at index i)
        int take = Integer.MAX_VALUE;
        if (amt - coins[i] >= 0) {
            int res = minCoins(coins, amt - coins[i], i);
            if (res != Integer.MAX_VALUE) {
                take = 1 + res;
            }
        }

        return Math.min(take, skip);
    }

    /**
     * Solves Coin Change using memoization (Top-Down 2D DP).
     *
     * <p>
     * <b>Time Complexity:</b> O(n &times; amt)<br>
     * <b>Space Complexity:</b> O(n &times; amt) + O(amt) stack depth
     * </p>
     *
     * @param coins array of available coin denominations
     * @param amt   remaining amount to make change for
     * @param i     current coin index being considered
     * @param dp    memoization table of dimensions [coins.length][amt + 1]
     * @return minimum coins needed, or Integer.MAX_VALUE if impossible
     */
    private int minCoins(int[] coins, int amt, int i, int[][] dp) {
        if (amt == 0) {
            return 0;
        }
        if (i >= coins.length) {
            return Integer.MAX_VALUE;
        }

        if (dp[i][amt] != -1) {
            return dp[i][amt];
        }

        int skip = minCoins(coins, amt, i + 1, dp);

        int take = Integer.MAX_VALUE;
        if (amt - coins[i] >= 0) {
            int res = minCoins(coins, amt - coins[i], i, dp);
            if (res != Integer.MAX_VALUE) {
                take = 1 + res;
            }
        }

        return dp[i][amt] = Math.min(take, skip);
    }

    /**
     * Solves Coin Change using space-optimized tabulation (1D DP).
     *
     * <p>
     * <b>Time Complexity:</b> O(n &times; amt)<br>
     * <b>Space Complexity:</b> O(amt)
     * </p>
     *
     * @param coins array of available coin denominations
     * @param amt   target total amount
     * @return minimum coins needed, or -1 if impossible to form the amount
     */
    private int minCoins(int[] coins, int amt) {
        int[] dp = new int[amt + 1];

        // Fill with a sentinel value larger than any possible valid coin count
        Arrays.fill(dp, amt + 1);

        dp[0] = 0;

        for (int coin : coins) {
            // Forward loop allows infinite supply of the current coin
            for (int i = coin; i <= amt; i++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }

        return dp[amt] > amt ? -1 : dp[amt];
    }

    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
        int[] coins = {1, 2, 3};
        int amt = 4;

        // 1. Pure Recursion
        int resRec = cc.minCoins(coins, amt, 0);
        System.out.println("Recursion min coins: " + (resRec == Integer.MAX_VALUE ? -1 : resRec));

        // 2. Memoization
        int[][] dp = new int[coins.length][amt + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int resMemo = cc.minCoins(coins, amt, 0, dp);
        System.out.println("Memoization min coins: " + (resMemo == Integer.MAX_VALUE ? -1 : resMemo));

        // 3. Tabulation (1D DP)
        int resTab = cc.minCoins(coins, amt);
        System.out.println("Tabulation (1D DP) min coins: " + resTab);
    }
}
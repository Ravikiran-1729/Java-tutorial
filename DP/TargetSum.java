import java.util.Arrays;
public class TargetSum {

    /**
     * Solves the Subset Sum / Target Sum problem using space-optimized tabulation (1D DP).
     *
     * <p>
     * <b>Time Complexity:</b> O(n &times; target)<br>
     * <b>Space Complexity:</b> O(target)
     * </p>
     *
     * @param nums   array of available non-negative integers
     * @param target required subset sum
     * @return total number of subsets whose sum equals target
     */
    public int targetSum(int[] nums, int target) {
        int[] dp = new int[target + 1];

        // 1 way to make sum 0: the empty set
        dp[0] = 1;

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }

        return dp[target];
    }

    /**
     * Solves the Subset Sum / Target Sum problem using pure recursion.
     *
     * <p>
     * <b>Time Complexity:</b> O(2^n)<br>
     * <b>Space Complexity:</b> O(n) (recursion call stack)
     * </p>
     *
     * @param nums   array of available non-negative integers
     * @param target remaining target sum
     * @param i      current index in nums being evaluated
     * @return total number of subsets whose sum equals target
     */
    private int targetSum(int[] nums, int target, int i) {
        if (i == nums.length) {
            return target == 0 ? 1 : 0;
        }

        int skip = targetSum(nums, target, i + 1);
        int take = 0;

        if (target - nums[i] >= 0) {
            take = targetSum(nums, target - nums[i], i + 1);
        }

        return take + skip;
    }

    /**
     * Solves the Subset Sum / Target Sum problem using memoization (Top-Down 2D DP).
     *
     * <p>
     * <b>Time Complexity:</b> O(n &times; target)<br>
     * <b>Space Complexity:</b> O(n &times; target) + O(n) call stack
     * </p>
     *
     * @param nums   array of available non-negative integers
     * @param target remaining target sum
     * @param i      current index in nums being evaluated
     * @param dp     memoization table storing state [index][remainingTarget]
     * @return total number of subsets whose sum equals target
     */
    private int targetSum(int[] nums, int target, int i, int[][] dp) {
        if (i == nums.length) {
            return target == 0 ? 1 : 0;
        }

        if (dp[i][target] != -1) {
            return dp[i][target];
        }

        int skip = targetSum(nums, target, i + 1, dp);
        int take = 0;

        if (target - nums[i] >= 0) {
            take = targetSum(nums, target - nums[i], i + 1, dp);
        }

        return dp[i][target] = take + skip;
    }

    public static void main(String[] args) {
        TargetSum ts = new TargetSum();
        int[] nums = {4, 2, 7, 1, 3};
        int target = 10;

        // Recursion
        int targetSumWays1 = ts.targetSum(nums, target, 0);
        System.out.println("Ways to achieve target sum using recursion: " + targetSumWays1);

        // Memoization
        int[][] dp = new int[nums.length][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int targetSumWays2 = ts.targetSum(nums, target, 0, dp);
        System.out.println("Ways to achieve target sum using memoization: " + targetSumWays2);

        // Tabulation
        int targetSumWays3 = ts.targetSum(nums, target);
        System.out.println("Ways to achieve target sum using tabulation: " + targetSumWays3);
    }
}
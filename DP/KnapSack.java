
import java.util.Arrays;

public class KnapSack{
    // Memorization
    private int knapSack(int[] val, int[] wt, int W, int i, int[][] dp){
        if(W < 0 || i >= val.length){
            return 0;
        }

        int skip = knapSack(val, wt, W, i+1, dp);
        int take = 0;

        if(W-wt[i] >= 0){
            take = val[i] + knapSack(val, wt, W-wt[i], i+1, dp);
        }

        return dp[W][i] = Math.max(take, skip);
    }

    // Tabulation
    private int knapSack(int[] val, int[] wt, int W){
        int[] dp = new int[W+1];
        
        Arrays.fill(dp, 0);

        for (int i = 0; i < val.length; i++) {
            for(int j = W; j>=wt[i]; j--){
                dp[j] = Math.max(
                    dp[j], 
                    val[i] + dp[j - wt[i]]
                );
            }
        }

        return dp[W];
    }

    public static void main(String[] args) {
        KnapSack ks = new KnapSack();
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int W = 7;

        // Call Memorization knapsack function
        int maxProfit1 = ks.knapSack(val, wt, W);
        
        System.out.println("Memorization knapsack max profit: " + maxProfit1);
        


        // Call Tabulization knapsack function
        int[][] dp = new int[W+1][val.length];

        int maxProfit2 = ks.knapSack(val, wt, W, 0, dp);

        System.out.println("Tabulization knapsack max profit: " + maxProfit2);
    }
}
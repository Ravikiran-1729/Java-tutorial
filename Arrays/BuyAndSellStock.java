public class BuyAndSellStock {

    private static int buyAndSellStock(int prices[]){
        int minBuyPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i<prices.length; i++){
            if(minBuyPrice > prices[i]){
                minBuyPrice = prices[i];
            }else{
                int profit = prices[i] - minBuyPrice;
                maxProfit = Integer.max(profit, maxProfit);
            }
        }

        return maxProfit;
    }

     public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,10};
        int maxProfit = buyAndSellStock(prices);
        System.out.println(maxProfit);
     }
}
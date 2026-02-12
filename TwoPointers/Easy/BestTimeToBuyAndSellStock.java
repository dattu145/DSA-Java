public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices){
        int minprice = prices[0];
        int maxprofit = 0;

        if(prices == null || prices.length == 0) return 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            } else {
                int profit = prices[i] - minprice;
                if(profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}

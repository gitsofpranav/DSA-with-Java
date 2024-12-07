public class maxprofit {
    public static int max_profit(int[] prices) {
        int buying_price = Integer.MAX_VALUE;
        int maximum_profit = 0;
        for(int i=0; i<prices.length; i++) {
            if(buying_price < prices[i]) {
                int profit = prices[i] - buying_price;
                maximum_profit = Math.max(maximum_profit, profit);
            }else {
                buying_price = prices[i];
            }
        }
        return maximum_profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("maximum profit "+max_profit(prices));
    }
}

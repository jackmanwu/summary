package gaopin.jingdian;

/**
 * 买卖股票的最佳时机
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if ((price - minPrice) > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}

public class BuyLowSellHigh {
    public static int maximumProfit(int[] prices){
        int profitDiff = 0;
        int headPointer = 1;
        int tailPointer = 0;

        //headPointer should always be atleast one day ahead of tailPointer
        //hence, headPointer > tailPointer at any given point

        while(headPointer < prices.length){
            if(prices[headPointer] < prices[tailPointer]){
                tailPointer = headPointer;
            } else if (prices[headPointer] - prices[tailPointer] > profitDiff) {
                profitDiff = prices[headPointer] - prices[tailPointer];
            }
            headPointer++;

        }
        return profitDiff;
    }
}

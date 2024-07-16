class Solution {
    public int maxProfit(int[] prices) {
        int greatest = 0;
        int maxProfit = 0;
        for(int idx=prices.length-1; idx>=0; idx--){
            greatest = Math.max(greatest, prices[idx]);
            maxProfit = Math.max(greatest-prices[idx], maxProfit);
        }
        return maxProfit;
    }
}

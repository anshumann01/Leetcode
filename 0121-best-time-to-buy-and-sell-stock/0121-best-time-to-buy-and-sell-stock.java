class Solution {
    public int maxProfit(int[] prices) {
        //find Buying Price 
        int BuyPrice=Integer.MAX_VALUE;
        int Maxprofit=0;
        for(int i=0;i<prices.length;i++) {
            if(BuyPrice<prices[i]) { 
                int profit = prices[i]-BuyPrice;
                Maxprofit=Math.max(Maxprofit,profit);
            }
            else {
                BuyPrice=prices[i];
            }
        }
        return Maxprofit;
    }
}
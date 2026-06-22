class Solution {
    public int maxProfit(int[] prices) {
        int maxpro=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]>min){
                maxpro=Math.max(maxpro,prices[i]-min);
            }
            else min=prices[i];
        }
        return maxpro;
        
    }
}
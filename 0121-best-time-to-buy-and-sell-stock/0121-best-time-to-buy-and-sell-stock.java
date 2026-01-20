class Solution {
    public int maxProfit(int[] prices) {
        int s=0;int e=1;int max_profit=0;
        while(e<prices.length){
            if(prices[s]<prices[e]){
             max_profit=Math.max(max_profit,prices[e]-prices[s]);
            }
            else{
                s=e;
            }
            e++;
        }
        return max_profit;
    }
}
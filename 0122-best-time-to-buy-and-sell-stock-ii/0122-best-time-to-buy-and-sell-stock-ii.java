class Solution {
    public int maxProfit(int[] prices) {
       int  profit=0;
        int minprice=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]>minprice){
                profit+=prices[i]-minprice;
               
            }
             minprice=prices[i];
          
        }
        return profit;
        
    }
}
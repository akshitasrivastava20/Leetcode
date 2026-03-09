class Solution {
    public int maxProfit(int[] prices) {
       int maxpro=0;int min=Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++){
        if(min<prices[i]){
            maxpro=Math.max(maxpro,prices[i]-min);

        }
        else{
            min=prices[i];
        }

       } 
       return maxpro;
    }
}
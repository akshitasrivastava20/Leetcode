class Solution {
    public int maxProfit(int[] prices) {
        int s=0;int e=1;int sum=0;
        while(e<prices.length){
            if(prices[s]<prices[e]){
                sum=sum+prices[e]-prices[s];
                s=e;
            }
            else{
                s=e;
            }
            e++;
        }
        return sum;
    }
}
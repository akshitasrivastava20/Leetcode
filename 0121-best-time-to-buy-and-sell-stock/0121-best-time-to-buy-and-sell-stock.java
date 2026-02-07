class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int max=0;

        for(int i:prices){
            if(i<=minprice) minprice=i;
            else{ max=Math.max(max,i-minprice);}
        }
        return max;
    }
}
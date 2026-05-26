class Solution {
    public int maxSubArray(int[] nums) {
        int i=0;int j=0;
        int sum=0;int maxsum=Integer.MIN_VALUE;
        while(j<nums.length){
            
            sum=sum+nums[j];
            maxsum=Math.max(sum,maxsum);
            if(sum<0)
             {
                sum=0;
                i=j+1;
            }
            j++;
        }
        return maxsum;
    }
}
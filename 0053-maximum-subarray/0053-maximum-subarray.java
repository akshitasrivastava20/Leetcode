class Solution {
    public int maxSubArray(int[] nums) {
        int j=0;int sum=0;int maxsum=Integer.MIN_VALUE;
        while(j<nums.length){

            sum+=nums[j];
            maxsum=Math.max(maxsum,sum);
            if(sum<0){
                sum=0;
            }
            j++;
        }
        return maxsum;
    }
}
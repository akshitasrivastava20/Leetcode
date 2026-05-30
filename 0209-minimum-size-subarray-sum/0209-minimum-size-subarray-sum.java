class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int len=Integer.MAX_VALUE;
        int i=0;int j=0;int n=nums.length;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                len=Math.min(len,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return (len==Integer.MAX_VALUE)? 0:len;
    }
}
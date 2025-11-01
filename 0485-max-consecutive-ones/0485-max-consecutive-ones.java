class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int l=0;int r=0;int max_ones=0;int count=0;int n=nums.length;
       while(r<n){
            if(nums[r]==1){
                count=r-l+1;
                max_ones=Math.max(max_ones,count);
                
            }
            else{
                l=r+1;
            }
            r++;

       }
       return max_ones;

    }
}
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        for(int i:nums){
            total+=i;
        }
        int circular=total-kadanereverse(nums);
        if(circular==0) return kadane(nums);
        else return Math.max(kadane(nums),circular);
    }

    private int kadane(int[] nums){
        //maxsubarraysum
        int max=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
              ans=Math.max(ans+nums[i],nums[i]);
              max=Math.max(max,ans);
        }
        return max;
    }

    private int kadanereverse(int[] nums){
          int min=nums[0];
          int ans=nums[0];
          for(int i=1;i<nums.length;i++){
            ans=Math.min(ans+nums[i],nums[i]);
            min=Math.min(min,ans);
          }
          return min;
    }

}
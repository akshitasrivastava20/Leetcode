class Solution {
    public int maxProduct(int[] nums) {
        int maxpro=nums[0];
        int minpro=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=maxpro;
                maxpro=minpro;
                minpro=temp;
            }
            maxpro=Math.max(nums[i],nums[i]*maxpro);
            minpro=Math.min(nums[i],nums[i]*minpro);
            ans=Math.max(ans,maxpro);

        }
        return ans;
    }
}
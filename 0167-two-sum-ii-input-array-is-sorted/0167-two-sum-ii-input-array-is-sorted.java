class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s=0;int e=nums.length-1;int sum=0;
        while(s<=e){
            sum=nums[s]+nums[e];
            if(sum==target) return new int[]{s+1,e+1};
            else if(sum>target){
                e--;
            }
            else{
                s++;
            }

        }
        return new int[]{-1,-1};
    }
}
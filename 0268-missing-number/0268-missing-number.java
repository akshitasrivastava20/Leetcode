class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        for(;i<n;i++){
            if(nums[i]!=i) return i;

        }
        return i;
    }
}
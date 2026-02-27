class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int max=1;
        int len=1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])continue;
            if(nums[i]!=nums[i-1]+1){
                max=Math.max(max,len);
                len=1;
            }
            else{
                len++;
            }
            

        }
        max=Math.max(max,len);

        return max;
    }
}
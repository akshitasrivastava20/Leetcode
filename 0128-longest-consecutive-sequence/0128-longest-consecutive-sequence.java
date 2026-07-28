class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int i=0;int j=1;
        int len=1;
        int maxlen=1;
        while(j<nums.length){
            if(nums[j]==nums[j-1]) {j++;continue;}
            if(nums[j]!=nums[j-1]+1){
                i=j;
                len=1;
            }
            else{
                len++;
            }
            maxlen=Math.max(maxlen,len);
            j++;

        }
        return maxlen;
        
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0||nums.length==1) return nums.length;
        
        Arrays.sort(nums);
        int len=1;
        int maxlen=Integer.MIN_VALUE;
        int i=0;int j=1;
        while(j<nums.length){
            if(nums[j]==nums[j-1]) {
                i=j;
                j++;
                continue;
            }
            if(nums[j]==nums[j-1]+1){
                len++;
            }
            else{
                i=Math.max(i,j);
                len=1;

            }
            maxlen=Math.max(len,maxlen);
            j++;

        }
        return maxlen==Integer.MIN_VALUE?1:maxlen;
        
    }
}
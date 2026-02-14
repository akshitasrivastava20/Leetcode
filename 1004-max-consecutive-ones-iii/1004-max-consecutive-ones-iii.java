class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=0;
        int maxlen=0;
        int count1=0;

        while(j<n){
            if(nums[j]==1) count1++;

            //check for valid
            while((j-i+1)-count1>k){
                //not valid-> shrink
                if(nums[i]==1) count1--;
                i++;

            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}
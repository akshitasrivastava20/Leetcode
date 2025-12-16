class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,k=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                j++;
                max=Math.max(j-k,max);
            }else{
                k=i+1;
                j=j+1;
            }
        }
        return max;
    }
}
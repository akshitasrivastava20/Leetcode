class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int n=nums.length;int c;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            c=0;
           for(int j=0;j<n;j++){
            if(nums[j]<nums[i]&&j!=i)c++;
           }
           ans[i]=c;

        }
        return ans;
    }
}
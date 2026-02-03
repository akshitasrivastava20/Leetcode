class Solution {
    public int findPeakElement(int[] nums) {
        
        
        if(nums.length==1||nums.length==0) return nums.length-1;
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            
            if(nums[mid+1]>nums[mid])
             {
                l=mid+1;
                }
            else h=mid;
        }
        return l;
 
    }
}
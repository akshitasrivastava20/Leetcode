class Solution {
    public int findMin(int[] nums) {
        //find pivot which will be the min 
        int l=0;int h=nums.length-1;int pivot;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]>nums[h]) l=mid+1;
            else h=mid;
        }
        pivot=l;
        return nums[pivot];
    }
}
class Solution {
    public int search(int[] nums, int target) {
        //find pivot
        int l=0;
        int h=nums.length-1;
        int pivot;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]>nums[h])l=mid+1;
            else h=mid;
            
        }
        pivot=l;
        //find target
        l=0;
        h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int realmid=(mid+pivot)%nums.length;
            if(nums[realmid]==target) return realmid;
            else if(nums[realmid]>target)h=mid-1;
            else l=mid+1;
        }
        return -1;
    }
}
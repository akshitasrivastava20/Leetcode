class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int[] arr={-1,-1};
        
        arr[0]=findFirst(nums,l,h,target);
        arr[1]=findLast(nums,l,h,target);
        return arr;
        
    }
    private static int findFirst(int[] nums,int l,int h,int target){
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target) {
                ans=mid;
                h=mid-1;
            }
            else if(nums[mid]>target) h=mid-1;
            else l=mid+1;
        }
        return ans;
    }
    private static int findLast(int[] nums,int l,int h,int target){
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target) {
                ans=mid;
                l=mid+1;
            }
            else if(nums[mid]>target) h=mid-1;
            else l=mid+1;
        }
        return ans;
    }
}
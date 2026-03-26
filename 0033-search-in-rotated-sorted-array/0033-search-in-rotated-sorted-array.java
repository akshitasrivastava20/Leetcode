class Solution {
    public int search(int[] nums, int target) {
        //find the pivot
        int s=0;int e=nums.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[e]) s=mid+1;
           else  e=mid;

        }
        int pivot=s;
        //find tRGET
       s=0;
        e=nums.length-1;
        while(s<=e){
             int mid=s+(e-s)/2;
            int real=(mid+pivot)%nums.length;
            if(nums[real]==target) return real;
            else if(nums[real]>target) e=mid-1;
            else s=mid+1;

        }
        return -1;
    }
}
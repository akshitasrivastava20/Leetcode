class Solution {
    public int search(int[] nums, int target) {
        int s=0;int e=nums.length-1;int pivot=0;
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]<nums[e]){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        pivot=s;
        s=0;
        e=nums.length-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            int realmid=(mid+pivot)%nums.length;
            if(nums[realmid]==target) return realmid;
            else if(nums[realmid]<target) s=mid+1;
            else e=mid-1;
        }
        return -1;
    }
}
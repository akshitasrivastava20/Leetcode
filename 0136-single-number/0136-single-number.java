class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i:nums){
            result^=i;
        }
        return result;
    }
}
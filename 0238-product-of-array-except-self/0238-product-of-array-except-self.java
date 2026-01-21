class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pro=new int[nums.length];
        int[] cro=new int[nums.length];
        int mul=1;int suffix=1;int prefix=1;
        
        for(int i=0;i<pro.length;i++){
            pro[i]=prefix;
            prefix=prefix*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
           cro[i]=suffix;
           suffix=suffix*nums[i];

        }
        for(int i=0;i<nums.length;i++){
            nums[i]=pro[i]*cro[i];
        }
        return nums;

    }
}
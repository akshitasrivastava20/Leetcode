class Solution {
    public int[] productExceptSelf(int[] nums) {
   
        int[] prefix=new int[nums.length];
        
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i-1]*prefix[i-1];
        }
        int suffix=1;
        
        for(int i=nums.length-2;i>=0;i--){
            suffix*=nums[i+1];
            prefix[i]*=suffix;

           
        }
        return prefix;
    }
}
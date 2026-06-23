class Solution {
    public void sortColors(int[] nums) {
        int[] arr=new int[3];
        for(int i:nums){
            arr[i]++;
        }
       
       int idx=0;
       int i=0;
       while(i<3){
         while(arr[i]!=0){
            nums[idx++]=i;
            arr[i]--;
         }
         i++;
       }

       
        
    }
}
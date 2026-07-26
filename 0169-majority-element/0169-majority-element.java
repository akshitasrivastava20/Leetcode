class Solution {
    public int majorityElement(int[] nums) {
        //just like elections
        int majority=0;
        int res=0;
        for(int n:nums){
            if(majority==0){
                res=n;
                majority+=1;

            }
            else{
                if(n==res) majority+=1;
                else majority-=1;
            }
        }
        return res;

      
        
    }
}
class Solution {
    public int subarraySum(int[] nums, int k) {
      int pre=0;
      int total=0;
     //for a subarray to have sum=k ;there must exist a prefix sum subarrY =S-K
     HashMap <Integer,Integer>mp=new HashMap<>();
     mp.put(0,1);
     for(int i=0;i<nums.length;i++){
          pre+=nums[i];
          if(mp.containsKey(pre-k)){
            total+=mp.get(pre-k);
          }
          mp.put(pre,mp.getOrDefault(pre,0)+1);

          
     }
     return total;
        
    }
}
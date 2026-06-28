class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> mp=new HashMap<>();
       mp.put(0,1);
       int pre=0;int count=0;
       for(int i=0;i<nums.length;i++){
         pre+=nums[i];
         if(mp.containsKey(pre-k)) count+=mp.get(pre-k);
         mp.put(pre,mp.getOrDefault(pre,0)+1);
          
       }
       return count;

        
    }
}
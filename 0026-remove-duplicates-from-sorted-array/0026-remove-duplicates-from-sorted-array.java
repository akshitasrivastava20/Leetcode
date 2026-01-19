class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(Integer i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int j=0;
       for(Integer i:mp.keySet()){
          nums[j]=i;
          j++;
       }
       Arrays.sort(nums,0,j);
       return mp.size();

    }
}
class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        //0 sum wali 1 array hai
        mp.put(0,1);
        int pre=0;
        for(int i=0;i<nums.length;i++){
            pre+=nums[i];
            if(mp.containsKey(pre-k)){
                ans+=mp.get(pre-k);

            }
            mp.put(pre,mp.getOrDefault(pre,0)+1);
        }
        return ans;



    }
}
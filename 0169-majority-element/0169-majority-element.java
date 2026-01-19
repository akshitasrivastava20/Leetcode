class Solution {
    public int majorityElement(int[] nums) {
        double c=Math.ceil(nums.length/2);
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);

        }
        int r=nums[0];
        for(int i:mp.keySet()){
            if(mp.get(i)>c) {
                r=i; break;
            }
        }
        return r;
        
    }
}
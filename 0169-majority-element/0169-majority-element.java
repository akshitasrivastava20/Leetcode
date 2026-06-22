class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
            

        }
        for(int key:mp.keySet()){
            if(mp.get(key)>n/2) return key;
        }
        return -1;
        

    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
            List<Integer> lst=new ArrayList<>();
            HashMap<Integer,Integer> mp=new HashMap<>();
            for(int i:nums){
                mp.put(i,mp.getOrDefault(i,0)+1);
            }

            for(int i:mp.keySet()){
                if(mp.get(i)>Math.ceil(nums.length/3)) lst.add(i);
            }
            return lst;


        
    }
}
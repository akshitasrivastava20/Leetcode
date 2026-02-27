class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
            if(mp.get(num)>Math.ceil(nums.length/3)){
                if(!ans.contains(num)) ans.add(num);
            }

        }
        return ans;
    }
}
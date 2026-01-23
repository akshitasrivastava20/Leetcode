class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
       
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
       
        for(int k=0;k<nums.length-2;k++){
            int s=k+1;int e=nums.length-1;
            while(s<e){
                if(nums[s]+nums[e]==(-1)*nums[k]) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[s],nums[e],nums[k])));
                    while (s < e && nums[s] == nums[s + 1]) s++;
                    while (s < e && nums[e] == nums[e - 1]) e--;
                    s++;
                    e--;
                }
                else if(nums[s]+nums[e]>(-1)*nums[k]) e--;
                else s++;

            }
            

        }
        List<List<Integer>> unique = new ArrayList<>(new HashSet<>(ans));

        return unique;

    }
}
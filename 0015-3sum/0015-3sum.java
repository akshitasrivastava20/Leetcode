class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int sum=0;
        Arrays.sort(nums);
       for(int k=0;k<nums.length-2;k++){
        if(k > 0 && nums[k] == nums[k-1]) continue;
        int target=nums[k];

        int s=k+1;int e=nums.length-1;
        while(s<e){
            sum=nums[s]+nums[e];
            if(sum==target*-1){
                ans.add(new ArrayList<>(Arrays.asList(target,nums[s],nums[e])));
                s++;e--;
                while(s<e&&nums[s]==nums[s-1])s++;
                while(s<e && nums[e]==nums[e+1])e--;
            }
            else if(sum> target*-1){
                e--;
            }
            else {
                s++;
            }


        }


       }
       return ans;
    }
}
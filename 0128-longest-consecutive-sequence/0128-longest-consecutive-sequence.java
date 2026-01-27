class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        HashMap<Integer,Integer> mp=new HashMap<>();int f=0;
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i]-1)){
                int val=mp.get(nums[i]-1);
                f=Math.max(f,val+1);
                mp.put(nums[i],val+1);
            }
            else{ mp.put(nums[i],0);}
            
        }
        return f+1;
    }
}
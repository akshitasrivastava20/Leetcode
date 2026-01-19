class Solution {
    public int removeDuplicates(int[] nums) {
       HashMap<Integer,Integer> mp=new HashMap<>();
       for(int i:nums){
        mp.put(i,mp.getOrDefault(i,0)+1);
       } 
       int j=0;
       for(int i:mp.keySet()){
        if(mp.get(i)>=2){
           nums[j]=i;
           j++;
           nums[j]=i;
           j++;
        }
        else{
            nums[j]=i;
            j++;
        }
       }
       Arrays.sort(nums,0,j);
       return j;

    }
}
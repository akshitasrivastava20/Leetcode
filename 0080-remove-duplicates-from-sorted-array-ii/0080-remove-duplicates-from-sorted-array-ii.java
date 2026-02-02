class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);

        }
        int i=0;
        for(int k:mp.keySet()){
            int c=mp.get(k);
            if (c>=2){
                nums[i]=k;
                nums[i+1]=k;
                i+=2;
            }
            else{
                nums[i]=k;
                i++;
            }
            }

        Arrays.sort(nums,0,i);
        return i;
    }
}
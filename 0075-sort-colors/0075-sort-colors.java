class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int k=0;
        for(int i=0;i<3;i++){
            if(mp.containsKey(i)){
            int n=mp.get(i);
            while(n!=0){
              nums[k]=i;
              n--;k++;
            }
            }
        }
    }
}
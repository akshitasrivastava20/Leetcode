class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> lst=new ArrayList<>(mp.keySet());

        lst.sort((a,b)->mp.get(b)-mp.get(a));

        for(int i=0;i<k;i++){
            ans[i]=lst.get(i);
        }
        return ans;



        
    }
}
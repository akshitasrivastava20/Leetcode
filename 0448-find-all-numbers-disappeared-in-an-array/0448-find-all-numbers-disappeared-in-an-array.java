class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      HashMap<Integer,Integer> mp=new HashMap<>();
      ArrayList<Integer> lst=new ArrayList<>();
      for(int i:nums){
        mp.put(i,mp.getOrDefault(i,0)+1);
      }  
      for(int i=1;i<=nums.length;i++){
        if(!mp.containsKey(i)){
            lst.add(i);
        }
      }
      return lst;
    }
}
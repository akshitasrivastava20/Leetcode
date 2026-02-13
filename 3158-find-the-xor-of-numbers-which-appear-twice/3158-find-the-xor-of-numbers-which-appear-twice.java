class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
       HashMap<Integer,Integer> mp=new HashMap<>();
       for(int i :nums){
        if(mp.containsKey(i)){
            xor=xor^i;
        }
        else{
        mp.put(i,mp.getOrDefault(i,0)+1);}
       }
       return xor;

    }
}
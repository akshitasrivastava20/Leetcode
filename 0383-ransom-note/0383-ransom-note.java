class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:magazine.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(char ch:ransomNote.toCharArray()){
            
            if(!mp.containsKey(ch)) return false;
            int val=mp.get(ch);
            mp.put(ch,val-1);
            if(val-1<=0) mp.remove(ch);

        }
        return true;
    }
}
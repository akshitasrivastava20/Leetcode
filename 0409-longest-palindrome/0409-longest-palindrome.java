class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(mp.get(ch)==2) {count+=2;
            mp.put(ch,0);}
        }
        if(count<s.length()) return count+1;
        return count;

    }
}
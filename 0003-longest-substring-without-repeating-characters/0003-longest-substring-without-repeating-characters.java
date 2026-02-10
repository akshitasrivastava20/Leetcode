class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int len=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        int i=0;int j=0;
        while(j<s.length()){
            if(mp.containsKey(s.charAt(j))){
                i=Math.max(i,mp.get(s.charAt(j))+1);
            }
            
                mp.put(s.charAt(j),j);
                len=j-i+1;
                maxlen=Math.max(maxlen,len);
            
            j++;
        }
        return maxlen;
    }
}
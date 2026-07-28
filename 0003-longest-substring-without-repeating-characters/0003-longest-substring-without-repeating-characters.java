class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int len=0;
        int n=s.length();
        int i=0;int j=0;
        while(j<n){
            if(mp.containsKey(s.charAt(j))){
                i=Math.max(i,mp.get(s.charAt(j))+1);
            }
            mp.put(s.charAt(j),j);
            len=Math.max(len,j-i+1);
            j++;

        }
        return len;
        
    }
}
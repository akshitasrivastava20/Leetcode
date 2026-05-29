class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int i=0;int j=0;int n=s.length();int len=0;
        while(j<n){
            char ch=s.charAt(j);
            if(mp.containsKey(ch)){
                i = Math.max(i, mp.get(ch) + 1);
            }
            mp.put(ch,j);

            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}
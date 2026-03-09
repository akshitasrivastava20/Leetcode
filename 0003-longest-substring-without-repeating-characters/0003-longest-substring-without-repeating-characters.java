class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s.length()==1) return s.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        int maxlen=Integer.MIN_VALUE;
        int len=0;
        int i=0;int j=0;int n=s.length();
        while(j<n){
            if(mp.containsKey(s.charAt(j))){
                int index=mp.get(s.charAt(j));
                i=Math.max(i,index+1);
                
            }
                len=j-i+1;
                maxlen=Math.max(maxlen,len);
                mp.put(s.charAt(j),j);
                j++;


        }
        return maxlen;
    }
}
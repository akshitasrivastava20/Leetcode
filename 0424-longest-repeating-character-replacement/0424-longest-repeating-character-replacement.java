class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash=new int[26];
        int maxfreq=0;
        int len=0;
        int i=0;int j=0;
        while(j<s.length()){

            hash[s.charAt(j)-'A']++;
            maxfreq=Math.max(maxfreq, hash[s.charAt(j)-'A']);
            //valid window
            while((j-i+1)-maxfreq>k){
                hash[s.charAt(i)-'A']--;
                i++;

            }
           
                len=Math.max(len,j-i+1);
            
            j++;


        }
        return len;
    }
}
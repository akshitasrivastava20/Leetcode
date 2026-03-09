class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq=0;
        int[] hash=new int[26];
        
        int i=0;int j=0;
        int len=0;
        int n=s.length();
        while(j<n){
            hash[s.charAt(j)-'A']++;
            maxfreq=Math.max(maxfreq,hash[s.charAt(j)-'A']);
            //check for valid window
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
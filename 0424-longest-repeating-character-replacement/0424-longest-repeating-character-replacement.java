class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash=new int[26];
        int maxfreq=0;
        int ans=0;
        int i=0;int j=0;int n=s.length();
        while(j<n){
            hash[s.charAt(j)-'A']++;
            maxfreq=Math.max(maxfreq,hash[s.charAt(j)-'A']);

            while(j-i+1-maxfreq>k){
                hash[s.charAt(i)-'A']--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;


        }
        return ans;
    }
}
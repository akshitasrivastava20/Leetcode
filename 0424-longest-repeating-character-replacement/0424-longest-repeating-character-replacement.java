class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash = new int[26];
        int i = 0;
        int j = 0;
        int maxlen = 0;
        int maxfreq = 0;
        int n = s.length();
        while (j < n) {
            hash[s.charAt(j) - 'A']++;
            maxfreq = Math.max(maxfreq, hash[s.charAt(j) - 'A']);

            //check for validity

            while ((j - i + 1) - maxfreq > k) {
                //not valid-> shrink i
                hash[s.charAt(i) - 'A']--;

                i++;

            }

            maxlen = Math.max(maxlen, j - i + 1);

            j++;

        }
        return maxlen;
    }
}
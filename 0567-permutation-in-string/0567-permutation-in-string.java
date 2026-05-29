class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq = new int[26];
        int[] wfreq = new int[26];

        // frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int i = 0;
        int j = s1.length() - 1;
        int n = s2.length();

        // first window
        for (i = 0; i <= j; i++) {
            wfreq[s2.charAt(i) - 'a']++;
        }

        if (matches(freq, wfreq)) {
            return true;
        }
        i=0;

        // sliding window
        while (j < n - 1) {

            wfreq[s2.charAt(i) - 'a']--;
            i++;

            j++;
            wfreq[s2.charAt(j) - 'a']++;

            if (matches(freq, wfreq)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] arr1, int[] arr2) {

        for (int i = 0; i < 26; i++) {

            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
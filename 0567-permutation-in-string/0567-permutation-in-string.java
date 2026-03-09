class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        int[] hash = new int[26];
        int[] window = new int[26];

        int size = s1.length();

        for(int i = 0; i < size; i++){
            hash[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        if(matches(hash, window)) return true;

        for(int i = size; i < s2.length(); i++){
            window[s2.charAt(i) - 'a']++;            // add new char
            window[s2.charAt(i - size) - 'a']--;     // remove old char

            if(matches(hash, window)) return true;
        }

        return false;
    }

    private boolean matches(int[] a, int[] b){
        for(int i = 0; i < 26; i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}
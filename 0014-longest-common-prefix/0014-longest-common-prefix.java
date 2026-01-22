class Solution {
    public String longestCommonPrefix(String[] strs) {

        // take first string as smallest initially
        StringBuilder max = new StringBuilder(strs[0]);
        int min = strs[0].length();

        // find the smallest string
        for (String str : strs) {
            if (str.length() < min) {
                min = str.length();
                max = new StringBuilder(str);
            }
        }

        // shrink max until it is prefix of all strings
        for (String str : strs) {
            while (!str.startsWith(max.toString())) {
                max.deleteCharAt(max.length() - 1);
                if (max.length() == 0) {
                    return "";
                }
            }
        }

        return max.toString();
    }
}

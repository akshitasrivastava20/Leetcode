class Solution {
    public int lengthOfLastWord(String s) {
        String[] sb=s.trim().split(" ");
        return sb[sb.length-1].length();
    }
}
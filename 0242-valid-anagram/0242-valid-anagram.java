class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] s1=new int[26];
     

        for(char c:s.toCharArray()){
            s1[c-'a']++;
        }
        for(char c:t.toCharArray()){
            s1[c-'a']--;
        }
        for(int i:s1){
            if(i!=0) return false;
        }
        return true;


        
    }
}
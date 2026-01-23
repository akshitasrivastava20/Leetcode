class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
            for(char ch:s.toLowerCase().toCharArray()){
                if(Character.isLetterOrDigit(ch)){
                    sb.append(ch);
                }
            }
            String og=sb.toString();
            String rev=sb.reverse().toString();
            if(og.equals(rev)){return true;}
            return false;
        
    }
}
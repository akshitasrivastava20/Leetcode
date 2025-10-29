class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
              
            }
        }
        
        if(str.toString().equals(str.reverse().toString())) return true;
        else return false;
    }
}
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String frst=String.join("",word1);
        String sec=String.join("",word2);

        if(frst.equals(sec)){
            return true;
        }
        else{
            return false;
        }
    }
}
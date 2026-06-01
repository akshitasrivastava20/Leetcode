class Solution {
    public String longestPalindrome(String s) {
        int max=Integer.MIN_VALUE;
        String res="";
        for(int i=0;i<s.length();i++){
            //odd length
            int l=i;int r=i;
            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
                if(r-l+1>max){
                    max=r-l+1;
                    res=s.substring(l,r+1);
                }
                l--;
                r++;

            }

            //even length
            l=i;r=i+1;
            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
                if(r-l+1>max){
                    max=r-l+1;
                    res=s.substring(l,r+1);
                }
                l--;
                r++;

            }
        }
        return res;
    }
}
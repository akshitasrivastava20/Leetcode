class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        StringBuilder sb=new StringBuilder();
       int l=0;int e=0;int n=s.length();
       while(e<n){
          
          if(sb.indexOf(""+s.charAt(e))!=-1){
            l=s.indexOf(s.charAt(e),l)+1;
            
            sb.delete(0,sb.indexOf(""+s.charAt(e))+1);
            

          }
          sb.append(s.charAt(e));
          len=Math.max(len,e-l+1);
            e++;

       }
       return len;

    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;int r=0;int max_len=0;int len=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        int n=s.length();
        while(r<n){
            Integer index=mp.get(s.charAt(r));
            if(index!=null){

                if(index>=l){
                   l=index+1;
                }
               

            }
            
                 len=r-l+1;
                  max_len=Math.max(len,max_len);
                  mp.put(s.charAt(r),r);
                  r++;


            

        }
        return max_len;
    }
}
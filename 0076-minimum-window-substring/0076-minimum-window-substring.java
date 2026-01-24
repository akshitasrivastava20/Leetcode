class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:t.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int l=0;int r=0;int count=0;int min_start=0;int min_len=Integer.MAX_VALUE;
        while(r<s.length()){
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)-1);
            if(mp.get(s.charAt(r))>=0) count++;
            
            while(count==t.length()){
                if(r-l+1<min_len){
                    min_len=r-l+1;
                    min_start=l;
                }
                
                    mp.put(s.charAt(l),mp.get(s.charAt(l))+1);
                    if(mp.get(s.charAt(l))>0) {
                       count--;
                    }
                    l++;
                

            }
            r++;
        }
        return min_len == Integer.MAX_VALUE ? "" 
               :  s.substring(min_start,min_start+min_len);
    }
}
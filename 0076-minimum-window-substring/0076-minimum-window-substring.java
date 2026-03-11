class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        int n=s.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        int i=0;int j=0;int count =0;int len=Integer.MAX_VALUE;int min_start=0;
        for(char c:t.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        while(j<n){
           char ch=s.charAt(j);
          mp.put(ch,mp.getOrDefault(ch,0)-1);
            if(mp.get(ch)>=0) count++;
            while(count==t.length()){
                if(len>j-i+1){
                    len=j-i+1;
                    min_start=i;
                }
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);

                
                if(mp.get(s.charAt(i))>0) count--;
                i++;

                
            }
            j++;

        }
        if(len==Integer.MAX_VALUE){
            return "";
        }
        else return s.substring(min_start,min_start+len);

    }
}
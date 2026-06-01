class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        HashMap<Character,Integer> mp=new HashMap<>();
        int count=0;
        int min_start=Integer.MAX_VALUE;
        int len=Integer.MAX_VALUE;
        
        for(char c:t.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int i=0;int j=0;int n=s.length();
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
        return (len==Integer.MAX_VALUE)?"":s.substring(min_start,min_start+len);

        
    }
}
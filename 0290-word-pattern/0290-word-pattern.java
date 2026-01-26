class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character,String> mp=new HashMap<>();
        String[] strs=s.split("\\s+");
        char[] chrs=pattern.toCharArray();
        if(chrs.length!=strs.length) return false;

        for(int i=0;i<pattern.length();i++){
            String str=strs[i];
            char ch=chrs[i];
             if(mp.containsKey(ch)){
                if(!(mp.get(ch).equals(str))) return false;
             }
             else if(mp.containsValue(str)) return false;

             mp.put(ch,str);

        }
        return true;
    }
}
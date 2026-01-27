class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lst=new ArrayList<>();
        HashMap<String,List<String>> mp=new HashMap<>();

        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String p=new String(ch);
            mp.computeIfAbsent(p,k->new ArrayList<>()).add(s);


        }
        for(List<String> l:mp.values()){
            lst.add(l);
        }
        return lst;
        
    }
}
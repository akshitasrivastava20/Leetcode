class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> mp=new HashMap<>();

        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            mp.computeIfAbsent(s,k->new ArrayList<>()).add(str);

        }

        for(String s:mp.keySet()){
            ans.add(mp.get(s));
        }
        return ans;
        
    }
}
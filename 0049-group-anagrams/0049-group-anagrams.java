class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lst=new ArrayList<>();
        HashMap<String,List<String>> mp=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String str1=new String(arr);
            mp.computeIfAbsent(str1,k->new ArrayList<>()).add(str);

        }
        for(String str:mp.keySet()){
          lst.add(mp.get(str));
        }
        return lst;
    
    }
}
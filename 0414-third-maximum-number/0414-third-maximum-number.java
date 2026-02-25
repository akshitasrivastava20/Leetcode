class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ArrayList<Integer> lst=new ArrayList<>(set);
        Collections.sort(lst);

        if(lst.size()>=3) return lst.get(lst.size()-3);
        else return lst.get(lst.size()-1);
    }
}
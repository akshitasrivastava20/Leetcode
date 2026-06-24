class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        int n=candyType.length;
        for(int i:candyType) set.add(i);
        if(n/2>=set.size()) return set.size();
        else{
            return n/2;

        }
        
    }
}
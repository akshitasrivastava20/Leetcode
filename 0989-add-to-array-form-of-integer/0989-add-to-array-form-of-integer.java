class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> lst= new ArrayList<>();
        for(int i=num.length-1;i>=0;i--){
            int s=num[i]+k;
            lst.add(s%10);
            k=s/10;

        }
        while (k > 0) {
            lst.add(k % 10);
            k /= 10;
        }

        Collections.reverse(lst);
        return lst;
    }
}
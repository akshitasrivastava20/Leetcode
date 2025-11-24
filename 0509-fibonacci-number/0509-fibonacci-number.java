class Solution {
    public int fib(int n) {
        HashMap <Integer,Integer> mp=new HashMap<>();
         if(n==0||n==1) return n;
         if(mp.containsKey(n)) return mp.get(n);
         int result=fib(n-1)+fib(n-2);
         mp.put(n,result);
         return result;



    }
}
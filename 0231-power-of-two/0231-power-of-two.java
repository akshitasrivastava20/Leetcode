class Solution {
    public boolean isPowerOfTwo(int n) {
      int x=n;
       if (x > 0 && (x & (x - 1)) == 0) {
       return true;
}
return false;

    }
}
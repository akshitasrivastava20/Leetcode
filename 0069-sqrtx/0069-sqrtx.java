class Solution {
    public int mySqrt(int x) {
        if (x <= 1) return x;

        int s = 1;
        int e = x / 2;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            long square = (long) mid * mid;

            if (square == x) return mid;
            else if (square > x) e = mid - 1;
            else s = mid + 1;
        }

        return e;
    }
}
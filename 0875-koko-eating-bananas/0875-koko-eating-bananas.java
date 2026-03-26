class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int hi = findmax(piles);

        while (l <= hi) {
            int m = l + (hi - l) / 2;
            long time = hours(piles, m);  // long

            if (time > h) {
                l = m + 1;
            } else {
                hi = m - 1;
            }
        }
        return l;
    }

    private int findmax(int[] piles) {
        int max = 0;
        for (int p : piles) {
            max = Math.max(max, p);
        }
        return max;
    }

    private long hours(int[] piles, int hr) {
        long t = 0;   // FIXED
        for (int p : piles) {
            t += (p + hr - 1) / hr;
        }
        return t;
    }
}
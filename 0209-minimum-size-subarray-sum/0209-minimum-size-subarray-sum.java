class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int minlen = Integer.MAX_VALUE;
        while (j < nums.length) {
           
                sum += nums[j];
            while (sum >= target) {
                minlen = Math.min(minlen, j - i+1);
                sum -= nums[i];
                i++;
            }
                 j++;

        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}
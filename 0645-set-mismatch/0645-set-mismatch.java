

class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[2];

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!mp.containsKey(i)) {
                ans[1] = i; // missing
            }
            if (mp.getOrDefault(i, 0) == 2) {
                ans[0] = i; // duplicate
            }
        }

        return ans;
    }
}

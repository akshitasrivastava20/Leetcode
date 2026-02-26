class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] ans = new int[k];
        int p = 0;
        int n = nums.length;

        HashMap<Integer, Integer> mp = new HashMap<>();

        // Step 1: Frequency map
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // Step 2: Bucket array
        List<Integer>[] bucket = new List[n + 1];

        for (int num : mp.keySet()) {
            int freq = mp.get(num);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        }

        // Step 3: Traverse from high freq
        for (int i = n; i >= 0 && p < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {
                    ans[p++] = num;

                    if (p == k) break;
                }
            }
        }

        return ans;
    }
}
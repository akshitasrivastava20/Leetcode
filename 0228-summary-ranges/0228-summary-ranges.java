class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> lst = new ArrayList<>();
        if (nums.length == 0) return lst;

        int s = 0; // start index of range

        for (int i = 0; i < nums.length; i++) {

            // end of range condition
            if (i == nums.length - 1 || nums[i + 1] != nums[i] + 1) {

                if (s == i) {
                    lst.add(nums[s] + "");
                } else {
                    lst.add(nums[s] + "->" + nums[i]);
                }

                s = i + 1; // move start to next index
            }
        }
        return lst;
    }
}

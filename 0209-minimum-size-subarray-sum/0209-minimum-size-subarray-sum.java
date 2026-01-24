class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s=0;int e=0;int sum=0;int minlen=0;int n=nums.length;
        List<Integer> lst=new ArrayList<>();

        while(e<n){
            sum+=nums[e];
            if(sum<target)e++;
            else{
                lst.add(e-s+1);
                while(sum>=target){
                 lst.add(e-s+1);
                sum-=nums[s];

                s++;
                }
                e++;

            }




        }
        if (lst.isEmpty()) return 0;
        minlen=Collections.min(lst);
        return minlen;
    }
}
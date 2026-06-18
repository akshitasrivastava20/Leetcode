class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       List<Integer> lst=new ArrayList<>();
       Deque<Integer> dq=new ArrayDeque<>();
       

       for(int i=0;i<nums.length;i++){
        //check for valid window
        while(!dq.isEmpty()&&dq.peekFirst()<=i-k){
            dq.pollFirst();
        }
        while(!dq.isEmpty()&&nums[dq.peekLast()]<nums[i]){
            dq.pollLast();
        }
        dq.offerLast(i);
        if(i>=k-1){
            lst.add(nums[dq.peekFirst()]);
        }



       }
       int[] ans=new int[lst.size()];
       for(int i=0;i<lst.size();i++){
        ans[i]=lst.get(i);

       }
       return ans;

    }
}
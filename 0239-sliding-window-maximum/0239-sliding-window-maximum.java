class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        List<Integer> lst=new ArrayList<>();

        int idx=0;
        for(int i=0;i<k;i++){
            while(!dq.isEmpty()&& nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }

        for(int i=k;i<nums.length;i++){
            lst.add(dq.peekFirst());
            while(!dq.isEmpty()&&dq.peekFirst()<=i-k){
                  dq.pollFirst();
            }
            while(!dq.isEmpty()&& nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);




        }
        lst.add(dq.peekFirst());



        int[] arr=new int[lst.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[lst.get(i)];
        }
        return arr;
        
    }
}
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        //ele,greater
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty()&&(nums2[i]>st.peek())){
                {
                    mp.put(st.pop(),nums2[i]);

                }

            }
            st.push(nums2[i]);
        }
        while(!st.isEmpty()){
            mp.put(st.pop(),-1);

        }
        int k=0;
        for(int n:nums1){
            ans[k++]=mp.get(n);
        }
        return ans;

    }
}
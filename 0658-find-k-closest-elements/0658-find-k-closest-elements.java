class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();

        int s=0;int e=arr.length-k;

        while(s<e){
            int mid=s+(e-s)/2;
            if(x-arr[mid]>arr[mid+k]-x){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        for(int i=s;i<s+k;i++){
            ans.add(arr[i]);
        }
        return ans;

    }
}
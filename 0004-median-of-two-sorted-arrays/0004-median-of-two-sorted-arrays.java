class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] ans=new int[m+n];
        int i=0;int j=0;int k=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
              ans[k]=nums1[i];
              i++;k++;
            }
            else{
              ans[k]=nums2[j];
              j++;k++;
            }
        }
        while(i<m){
            ans[k]=nums1[i];
            i++;k++;
        }
        while(j<n){
            ans[k]=nums2[j];
            j++;k++;
        }
        int l=ans.length;
        if(l%2!=0){
            int pos=l/2;
            return ans[pos];
        }
        else{
            int pos1=l/2;
            double avg=(ans[pos1]+ans[pos1-1])/2.0;
            return avg;
        }
    }
}
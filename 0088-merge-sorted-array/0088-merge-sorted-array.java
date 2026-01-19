class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] l=Arrays.copyOfRange(nums1,0,m);
        
        int i=0;int j=0;int k=0;
        while(i<l.length&&j<nums2.length){
            if(l[i]<=nums2[j]){
                nums1[k]=l[i];
                i++;k++;
            }
            else{
                nums1[k]=nums2[j];
                j++;k++;
            }
        }
        while(i<l.length){
              nums1[k]=l[i];
                i++;k++;
        }
        while(j<nums2.length){
                nums1[k]=nums2[j];
                j++;k++;
        }

       
    }
}
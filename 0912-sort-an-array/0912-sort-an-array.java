class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length);
    }

    private int[] mergeSort(int[] arr,int l,int h){
         if (h - l == 1) {
            return new int[]{arr[l]};
        }
        int mid=l+(h-l)/2;
        int[] left= mergeSort(arr,l,mid);
        int[] right=mergeSort(arr,mid,h);
        return merge(left,right);
    }
    private int[] merge(int[] l,int[] r){
        int i=0,j=0,k=0;
        int[] ans=new int[l.length+r.length];
        while(i<l.length&&j<r.length){
            if(l[i]<=r[j]){
              ans[k]=l[i];
              i++;
              k++;
            }
            else{
                ans[k]=r[j];
                k++;j++;
            }
        }
        while(i<l.length){
            ans[k]=l[i];
              i++;
              k++;
        }
        while(j<r.length){
            ans[k]=r[j];
                k++;j++;
        }
        return ans;


    } 
}
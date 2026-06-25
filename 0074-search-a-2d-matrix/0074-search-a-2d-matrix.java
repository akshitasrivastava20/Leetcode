class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length-1;
        for(int i=0;i<matrix.length;i++){
            int l=0;
            int h=n;
            if(matrix[i][h]>=target&&i<matrix.length){
                while(l<=h){
                    int mid=l+(h-l)/2;
                    if(matrix[i][mid]==target) return true;
                    else if(matrix[i][mid]>target) h=mid-1;
                    else l=mid+1;
                }


            }
        }
        return false;
    }
}
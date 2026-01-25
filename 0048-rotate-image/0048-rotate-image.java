class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //transpose
        int i=0;
        while(i<n){
        for(int k=0;k<i;k++){
                
                int t=matrix[k][i];
                matrix[k][i]=matrix[i][k];
                matrix[i][k]=t;
            
        }
        i++;
        }
        //reverse rows
        for(int l=0;l<n;l++){
            for(int j=0;j<n/2;j++){
                int t=matrix[l][j];
                matrix[l][j]=matrix[l][n-1-j];
                matrix[l][n-1-j]=t;

            }
        }
    }
}
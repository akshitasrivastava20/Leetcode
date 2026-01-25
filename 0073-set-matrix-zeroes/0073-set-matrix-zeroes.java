class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> s1=new HashSet<>();//row
        HashSet<Integer> s2=new HashSet<>();//col
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0) {
                    s1.add(i);
                    s2.add(j);
                }

            }
        }

        for(int i:s1){
            for(int k=0;k<matrix[0].length;k++){
                matrix[i][k]=0;
            }

        }
        for(int j:s2){
            for(int k=0;k<matrix.length;k++){
                matrix[k][j]=0;
            }

        }
    }
}
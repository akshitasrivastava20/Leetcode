class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst=new ArrayList<>();
        int p=0;int q=matrix.length-1;int r=0;int s=matrix[0].length-1;
        while(p<=q&&r<=s){
            for(int k=r;k<=s;k++){
                lst.add(matrix[p][k]);
            }
            p++;
            for(int k=p;k<=q;k++){
                lst.add(matrix[k][s]);
            }
            s--;

            if(p<=q){
                for(int k=s;k>=r;k--){
                lst.add(matrix[q][k]);
            }
            q--;
            }
            if(r<=s){
                for(int k=q;k>=p;k--){
                lst.add(matrix[k][r]);
            }
            r++;
            }
        }
        return lst;
    }
}
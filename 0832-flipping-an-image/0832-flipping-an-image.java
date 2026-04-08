class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=n;

        for(int i=0;i<n;i++){
            for(int j=0;j<(m+1)/2;j++){
                int t=image[i][j]^1;
                image[i][j]=image[i][m-j-1]^1;
                image[i][m-j-1]=t;

            }
            
        }
        return image;

    }
}
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        if(n<1 || m<1) return true;
        int j=0;
        int i=0;
        while(i<m){   
            if(matrix[i][j]!=matrix[i+1][j+1]) return false;
            j++;
            if(j==n){
                j=0;
                i++;
            }
        }
        return true;

    }
}
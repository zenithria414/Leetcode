class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        for(int i1=0; i1<m; i1++){
            for(int j1=0; j1<n; j1++){
                if(matrix[i1][j1]==0){
                    rows[i1] = true;
                    cols[j1] = true;
                }
            }
        } 

        for(int i1=0; i1<m; i1++){
            for(int j1=0; j1<n; j1++){
                if(rows[i1] || cols[j1]){
                    matrix[i1][j1] = 0;
                }
            }
        }
    }
}
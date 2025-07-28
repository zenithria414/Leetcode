class Solution {
    public void transpose(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public void reverse(int[][] matrix){
        int i=0;
        while(i<matrix.length){
            int left = 0;
            int right = matrix[0].length;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
            i++;
        }
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
}
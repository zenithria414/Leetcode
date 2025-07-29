class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length-1;
        for(int i =0; i<m; i++){
            if(target== matrix[i][n]) return true;
            else if (target<matrix[i][n]){
                int low = 0;
                int high = n;
                while(low<=high){
                    int mid = low + (high - low)/2;
                    if(matrix[i][mid] == target) return true;
                    else if(matrix[i][mid]<target) low = mid+1;
                    else high = mid - 1;
                }
            }
        }
        return false;
    }
}
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        
        int rminmax = Integer.MIN_VALUE;
        for(int i=0; i<R; i++){
            int rmin = Integer.MAX_VALUE;
            for(int j=0; j<C; j++){
                rmin = Math.min(rmin, matrix[i][j]);
            }
            rminmax = Math.max(rminmax,rmin);
        }
        
        int cmaxmin = Integer.MAX_VALUE;
        for(int j=0; j<C; j++){
            int cmax = Integer.MIN_VALUE;
            for(int i=0; i<R; i++){
                cmax = Math.max(cmax, matrix[i][j]);
            }
            cmaxmin = Math.min(cmaxmin, cmax);
        }
        
        List<Integer> res = new ArrayList<>();
        
        if(rminmax == cmaxmin){
            res.add(rminmax);
            return res;
        }
        
        return res;
        
//         List<Integer> rowmin = new ArrayList<>();
        
//         for(int i=0; i<R; i++){
//             int rmin = Integer.MAX_VALUE;
//             for(int j=0; j<C; j++){
//                 rmin = Math.min(rmin,matrix[i][j]);
//             }
//             rowmin.add(rmin);
//         }
        
//         List<Integer> colmax = new ArrayList<>();
        
//         for(int j=0; j<C; j++){
//             int cmax = Integer.MIN_VALUE;
//             for(int i=0; i<R; i++){
//                 cmax = Math.max(cmax, matrix[i][j]);
//             }
//             colmax.add(cmax);
//         }
        
//         List<Integer> luckynum = new ArrayList<>();
        
//         for(int i=0; i<R; i++){
//             for(int j=0; j<C; j++){
//                 if(matrix[i][j]==rowmin.get(i) && matrix[i][j]==colmax.get(j)){
//                     luckynum.add(matrix[i][j]);
//                 }
//             }
//         }
//         return luckynum;
    }
}
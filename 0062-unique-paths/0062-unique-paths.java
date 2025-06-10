public class Solution {
    // public long fact(int n) {
    //     long factorial = 1;
    //     for (int i = 1; i <= n; i++) {
    //         factorial *= i;
    //     }
    //     return factorial;
    // }

    public int uniquePaths(int m, int n) {
        // long numerator = fact(m + n - 2);
        // long denominator = fact(m - 1) * fact(n - 1);
        // return (int)(numerator / denominator);

        //fact function easily overflows , int or long will overflow at number 20 itself
        //Hance not sufficient, switch to combinatorics

        //Use combination shortcut formula
        int N = m+n-2;
        int r = Math.min(m-1,n-1);
        long res = 1;
        for(int i=1; i<=r; i++){
            res = res * (N-r+i)/i ;
        }
        return (int)res;
    }
}

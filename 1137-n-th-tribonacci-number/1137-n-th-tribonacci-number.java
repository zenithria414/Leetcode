class Solution {
    public int tribonacci(int n) {
        if(n==0 || n==1) return n;
        if(n==2) return 1;
        // return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);   --> 3^n TC

        int a = 0, b = 1, c = 1;
        for(int i=3; i<=n; i++){
            int next = a + b + c;
            a = b;
            b = c;
            c = next;
        }
        return c;
    }
}
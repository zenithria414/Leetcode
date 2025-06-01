class Solution {
    public int distributeCandies(int n, int limit) {
               if(3L * limit < n) return 0;
        if(3L * limit == n) return 1;

        long count = 0;
        int maxFirstChild = Math.min(limit,n);

        for(int i=0; i<=maxFirstChild; i++){
            int rem = n -i;

            if(rem<=limit){
                count += rem + 1;
            }

            else if(2L*limit > rem){
                count += 2L * limit - rem +1;
            }
            //Above formula came from this
            // 0 ≤ second ≤ limit
            // 0 ≤ third ≤ limit
            // second + third = remaining

            else if(2L * limit == rem){
                count++;
            }
        }
    return count;
    }
}
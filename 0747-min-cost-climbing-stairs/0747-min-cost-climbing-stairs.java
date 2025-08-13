class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
        
        return Math.min(dp[n-1], dp[n-2]);

        //Greedy -> works for small tc
            // int n = cost.length;
            // if(n==1) return cost[0];
            // if(n==2) return Math.min(cost[0],cost[1]);
            // if(n==3){
            //     //if(Math.min(cost[0], Math.min(cost[0], cost[1]))==cost[0]) return cost[0]; 
            //     if(cost[0]+cost[2]>=cost[1]) return cost[1];
            //     else return cost[0]+cost[2];
            // }
            // int[] dp = new int[n];
            
            // int i=0, j=1;
            // while(i<n && j<n){
            //     if(cost[i]<=cost[j]){
            //         dp[i] = cost[i];
            //         i=j;
            //         j++;
            //     }else{
            //         dp[i] = cost[j];
            //         i=j+1;
            //         j=j+2;
            //     }
            // }
            // int sum = 0;
            // for(int idx=0; idx<dp.length; idx++){
            //     sum+=dp[idx];
            // }
            // return sum;
    }
}
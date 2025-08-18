class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); // large number as "infinity"
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        
        return dp[amount] > amount ? -1 : dp[amount];
        
        // Arrays.sort(coins);
        // int n = coins.length;
        // int count = 0;
        // for(int i = n-1; i>=0; i--){
        //     while(coins[i]<=amount){
        //         count++;
        //         amount -= coins[i];
        //     }
        // }
        // if(count != 0) return count;
        // return -1;
    }
}
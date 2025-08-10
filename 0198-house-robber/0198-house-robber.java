class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[n - 1];
        // int[] temp = new int[n];

        // int cnt = 0;
        // int res = Integer.MIN_VALUE;
        // for(int i=0; i<n-2; i++){
        //     temp[i]= nums[i]+nums[i+2];
        // }
        // for(int i=0; i<n-1; i++){
        //     cnt = Math.max(temp[i], temp[i+1]);
        //     res= Math.max(res, cnt);
        // }
        // return res;
    }
}
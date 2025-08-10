class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        int[] dpleft = new int[n];
        int[] dpright = new int[n];
        dpleft[0] = nums[0];
        dpleft[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i<n-1; i++){
            dpleft[i] = Math.max(dpleft[i-1], (dpleft[i-2]+nums[i]));
        }

        dpright[1] = nums[1];
        dpright[2] = Math.max(nums[1], nums[2]);
        for (int i = 3; i < n; i++) {
            dpright[i] = Math.max(dpright[i - 1], dpright[i - 2] + nums[i]);
        }

        return Math.max(dpleft[n-2], dpright[n-1]);
    }
}
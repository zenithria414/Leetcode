class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            curr_sum= curr_sum+nums[i];
            max_sum = Math.max(max_sum, curr_sum);
            if(curr_sum<0) {
                curr_sum=0;
            }
        }
        return max_sum;
        // if(nums.length==1) return nums[0];
        // int cs = 0;
        // int ms = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     cs += nums[i];
        //     if(cs<0) cs=0;
        //     ms = Math.max(ms,cs);
        // }
        // return ms;
    }
}
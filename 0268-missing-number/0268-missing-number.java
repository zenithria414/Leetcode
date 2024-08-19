class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = ((n+1)*(n))/2 ;  //sum of whole numbers
        int arrSum =0;
        for(int i=0; i<n; i++){
            arrSum += nums[i];
        }
        return (actualSum-arrSum);
    }
}
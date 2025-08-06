class Solution {
    public int minimumCost(int[] nums) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i=1; i<nums.length; i++){
            if(firstMin>nums[i]){
                secondMin = firstMin;
                firstMin = nums[i];
            }
            else if(secondMin>=nums[i]){
                secondMin = nums[i];
            }
        }
        //Always take first element as it as and find two min of the arrays
        return nums[0]+firstMin+secondMin;
    }
}
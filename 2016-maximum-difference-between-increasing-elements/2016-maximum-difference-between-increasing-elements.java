class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int diff = -1;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] > min){
                diff = Math.max(diff, nums[i]-min);
            }else{
                min = nums[i];
            }
        }
        
        return diff;
        
        // int l = 0;
        // int r = nums.length-1;
        // int currDiff = 0;
        // int maxDiff = Integer.MIN_VALUE;
        // while(l<r){
        //     if(nums[l]<nums[r]){
        //         currDiff = nums[r]-nums[l];
        //     }
        //     maxDiff = Math.max(currDiff,maxDiff);
        //     l++;
        //     r--;
        // }
        // return maxDiff;
    }
}
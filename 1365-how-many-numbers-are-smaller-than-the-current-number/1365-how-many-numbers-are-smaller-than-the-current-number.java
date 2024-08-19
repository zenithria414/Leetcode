class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        // int cnt=0;
        for(int i=0; i<nums.length ;i++){
            for(int j=0; j<nums.length; j++){
                if(nums[j]<nums[i] && i!=j){
                    res[i]++;
                }
            }
        }
        return res;
    }
}
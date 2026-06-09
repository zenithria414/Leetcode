class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int freq[] = new int[n+1];
        int dup = 0;
        int missing = 0;

        for(int num:nums){
            freq[num]++;
        }

        for(int i=0; i<n+1; i++){
            if(freq[i]==2) dup = i;
            if(freq[i]==0) missing = i;
        }

        return new int[]{dup,missing};
        // int dup = 0;
        // int[] res = new int[2];
        // for(int i=0; i<n-1; i++){
        //     if(nums[i]==nums[i+1]){
        //         dup = nums[i];
        //     }
        // }
        // res[0] = dup;
        // res[1] = dup+1;
        // return res;
    }
}
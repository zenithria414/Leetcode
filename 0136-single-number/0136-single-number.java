class Solution {
    public int singleNumber(int[] nums) {
        int result =0;
        for(int i=0; i<nums.length; i++){  //xor with same number will make result again 0
            result = result^nums[i];  //only if different number, then it will be stored in result not 0
        }
        return result;

        //Can be solved using sorting and checking adjacent numbers

        //Brute Force
            // int len = nums.length;
            // boolean isTwice = false; 
            // for (int i=0; i < len; i++) { 
            // isTwice = false;
            // for (int j=0; j<len; j++) {
            //     if (isTwice) break;
            //     if (i != j)
            //         if(nums[i] == nums[j]) 
            //             isTwice = true;
            // }         
            // if(!isTwice) return nums[i];
            // }
            // return 0;
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)) return num;
            seen.add(num);
        }
        return -1;
        // int n = nums.length;
        // int cnt = 0;
        // int num = 0;
        // boolean found = false;
        // for(int i=0; i<n; i++){
        //     int j = i+1;
        //     while(j<n){
        //         if(nums[i]==nums[j]){
        //             cnt++;
        //             num = nums[i];
        //             found = true;
        //             break;
        //         }
        //         j++;
        //     }
        //     if(found == true) break;
        // }
        // return num;
    }
}
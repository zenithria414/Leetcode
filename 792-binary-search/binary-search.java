class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(target == nums[mid]) return mid;
            if(target>nums[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;


















        
    //     int l = 0;
    //     int r = nums.length -1;
    //     while(l<=r) {
    //         int m = l+ (r-l)/2;
    //         if(nums[m]==target){
    //             return m;
    //         }
    //         else{
    //             if(nums[m]>target){
    //                 r=m-1;
    //             }
    //             else{
    //                 l=m+1;
    //             }
    //         }
    //     }
    // return -1;
    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Min-Heap-PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num); 
            if (pq.size() > k) {
                pq.poll(); 
            }
        }
        return pq.peek();

        //Using Stacks:
            // Stack<Integer> s = new Stack<>();
            // Arrays.sort(nums);
            // for(int i=0; i<nums.length; i++){
            //     s.push(nums[i]);
            // }
            // int res = -1;
            // for(int i=0; i<k; i++){
            //     res = s.pop();
            // }
            // return res;

        // Arrays.sort(nums);
        // return nums[nums.length-k];
    }
}
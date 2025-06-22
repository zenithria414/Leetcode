class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();

        // Initialize result with -1
        Arrays.fill(res, -1);

        // Loop twice to simulate circular behavior
        for (int i = 0; i < 2 * n; i++) {
            int current = nums[i % n];

            while (!s.isEmpty() && nums[s.peek()] < current) {
                res[s.pop()] = current;
            }

            // Push only during the first pass to avoid duplicate pushes
            if (i < n) {
                s.push(i);
            }
        }

        return res;
    }
}

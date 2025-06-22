class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int num:nums2){
            while(!s.isEmpty() && s.peek()<num){
                int top = s.pop();
                nextGreater.put(top, num);
            }
            s.push(num);
        }
        while (!s.isEmpty()) {
            nextGreater.put(s.pop(), -1);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = nextGreater.get(nums1[i]);
        }

        return res;
        
    }
}
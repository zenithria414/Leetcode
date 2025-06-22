class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();
        Arrays.fill(res,-1);
        for(int i=0; i<2*n; i++){
            int current = nums[i%n];
            while(!s.isEmpty() && nums[s.peek()] < current){
                s.pop();
                res[s.pop()] = current;
            }
            if(i<n){
                s.push(i);
            }    
        } 
        return res;
    }
}
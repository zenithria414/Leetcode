class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && temperatures[s.peek()]<=temperatures[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                res[i] = s.peek() - i;}
            // else {
            //     res[i] = temperatures[s.peek()];
            // }
            s.push(i);
        }
        return res;
    }
}
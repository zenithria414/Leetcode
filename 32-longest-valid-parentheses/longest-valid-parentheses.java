class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;
        for(int i=0; i < s.length(); i++){
            Character ch = s.charAt(i);
            if(ch == '(') st.push(i);
            else{
                st.pop();
                if(st.isEmpty()) st.push(i);
                else maxLen = Math.max(maxLen, i-st.peek());
            }
        }
        return maxLen;
    }
}
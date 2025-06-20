class Solution {
    public boolean isPalindrome(int left, int right, String s){
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        // Stack<Character> st = new Stack<>();
        // for(int i=0; i<s.length(); i++){
        //     st.push(s.charAt(i));
        //     if(st.peek()==s.charAt(s.length()-i-1)) st.pop();
        //     else return false;
        // }
        // return true;
        int left = 0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(left,right-1,s) || isPalindrome(left+1, right,s);
            }
            
        }
       return true; 
    }
}
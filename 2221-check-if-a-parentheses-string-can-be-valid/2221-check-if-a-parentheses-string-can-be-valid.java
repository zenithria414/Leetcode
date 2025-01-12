class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length()%2==1 || s.length()==0) return false;
        int open = 0;
        int close = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || locked.charAt(i)=='0'){
                open++;
            }
            else{
                open--;
            }
            if(open<0) return false;
        }

        for(int j=s.length()-1; j>=0; j--){
            if(s.charAt(j)==')' || locked.charAt(j)=='0'){
                close++;
            }else{
                close--;
            }
            if(close<0) return false;
        }

        return true;
    }
}
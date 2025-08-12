class Solution {
    public String countAndSay(int n) {
        if(n<=0) return "";
        String s = "1";

        for(int i=1; i<n; i++){ //runs to length n-1
            StringBuilder temp = new StringBuilder();
            int idx = 0;

            while(idx<s.length()){
                char current = s.charAt(idx);
                int count = 0;

                while (idx < s.length() && s.charAt(idx) == current) {
                    count++;
                    idx++;
                }
                temp.append(count).append(current);
            }
            s = temp.toString();
        }
        return s;
    }
}
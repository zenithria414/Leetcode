class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2 * k) {
            
            String firstK = s.substring(i, Math.min(i + k, s.length()));
            result.append(new StringBuilder(firstK).reverse());

            
            if (i + k < s.length()) {
                String nextK = s.substring(i + k, Math.min(i + 2 * k, s.length()));
                result.append(nextK);
            }
        }

        return result.toString();
    }
}
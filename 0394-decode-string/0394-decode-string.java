class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Build the number (can be multiple digits)
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current number and string
                countStack.push(k);
                stringStack.push(current);
                // Reset for new segment
                current = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                // Pop and repeat the current string
                int repeatTimes = countStack.pop();
                StringBuilder prev = stringStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    prev.append(current);
                }
                current = prev;
            } else {
                // Normal characters
                current.append(ch);
            }
        }

        return current.toString();
    }
}

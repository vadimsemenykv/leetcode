class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) return false;
        
        Stack<Character> stack = new Stack<Character>();
        int pos = 0;
        
        while (pos < s.length()) {
            var ch = s.charAt(pos);
            if (stack.size() == 0) {
                stack.push(ch);
            } else {
                var matching = false;
                
                if (ch == ')') matching = stack.peek() == '(';
                if (ch == '}') matching = stack.peek() == '{';
                if (ch == ']') matching = stack.peek() == '[';

                if (matching) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            pos++;
        }
        
        return stack.size() == 0;
    }
}
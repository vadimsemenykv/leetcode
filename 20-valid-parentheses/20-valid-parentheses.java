class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) return false;
        
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> matcher = new HashMap();
        matcher.put(')', '(');
        matcher.put('}', '{');
        matcher.put(']', '[');
        
        int pos = 0;
        
        while (pos < s.length()) {
            var ch = s.charAt(pos);
            if (stack.size() == 0) {
                stack.push(ch);
            } else {
                var matchedChar = matcher.get(ch);
                if (matchedChar != null && matchedChar.equals(stack.peek())) {
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
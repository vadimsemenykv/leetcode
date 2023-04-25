class Solution {
    public String removeDuplicates(String s) {
        var stack = new Stack<Character>();
        for (var ch : s.toCharArray()) {
            if (stack.size() != 0 && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        
        var builder = new StringBuilder();
        while (stack.size() > 0) {
            builder.insert(0, stack.pop());
        }
        
        return builder.toString();
    }
}
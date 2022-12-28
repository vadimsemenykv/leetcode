class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack();
        int pos = 0;
        StringBuilder sBuilder = new StringBuilder(s);
        
        while (pos < sBuilder.length()) {
            var ch = sBuilder.charAt(pos);
            if (stack.size() == 0 && ch == ')') {
                sBuilder.deleteCharAt(pos);
            } else {
                if (ch == '(') {
                    stack.push(pos);
                } else if (ch == ')' && stack.size() != 0) {
                    stack.pop();
                }
                
                pos++;
            }
        }
        
        while (stack.size() != 0) {
            sBuilder.deleteCharAt(stack.pop());
        }
        
        return sBuilder.toString();
    }
}
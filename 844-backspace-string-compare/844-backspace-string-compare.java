class Solution {
    public boolean backspaceCompare(String s, String t) {
        return process(s).equals(process(t));
    }
    
    private List<Character> process(String s) {
        List<Character> chars = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if (chars.size() > 0) chars.remove(chars.size() - 1);
            } else {
                chars.add(c);
            }
        }
        return chars;
    }
}
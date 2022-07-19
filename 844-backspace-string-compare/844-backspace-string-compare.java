class Solution {
    public boolean backspaceCompare(String s, String t) {
        //Two pointer solution T: O(n), S: O(1)
        return twoPointerComaring(s, t);
        
        //Brute Force solution T: O(n), S: O(n)
        // return process(s).equals(process(t));
    }
    
    private boolean twoPointerComaring(String s, String t) {
        int p1 = s.length() - 1;
        int p2 = t.length() - 1;
        while (p1 >= 0 || p2 >= 0) {
            if (getCharSafely(s, p1) == '#' || getCharSafely(t, p2) == '#') {
                int backCount = 2;
                if (getCharSafely(s, p1) == '#') {
                    while (backCount > 0) {
                        p1--;
                        backCount--;
                        if (getCharSafely(s, p1) == '#') backCount += 2;
                    }
                } else {
                    while (backCount > 0) {
                        p2--;
                        backCount--;
                        if (getCharSafely(t, p2) == '#') backCount += 2;
                    }
                }
            } else {
                if (getCharSafely(s, p1) != getCharSafely(t, p2)) return false;
                p1--;
                p2--;
            }
        }

        return true;
    }
    
    private Character getCharSafely(String s, int p) {
        return p >= 0 ? s.charAt(p) : Character.MIN_VALUE; 
    }
        
    // private List<Character> process(String s) {
    //     List<Character> chars = new LinkedList<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         char c = s.charAt(i);
    //         if (c == '#') {
    //             if (chars.size() > 0) chars.remove(chars.size() - 1);
    //         } else {
    //             chars.add(c);
    //         }
    //     }
    //     return chars;
    // }
}
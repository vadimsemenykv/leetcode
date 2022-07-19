class Solution {
    public int lengthOfLongestSubstring(String s) {
        //T: O(n) S: O(n)
        if (s.length() <= 1) {
            return s.length();
        }
        Map<Character, Integer> chars = new HashMap<>();
        int max = 0;
        int p = 0;
        while (p < s.length()) {
            if (!chars.containsKey(s.charAt(p))) {
                chars.put(s.charAt(p), p);
                p++;
            } else {
                p = chars.get(s.charAt(p)) + 1;
                max = Math.max(chars.size(), max);
                chars = new HashMap<>();
            }
        }
        
        return Math.max(chars.size(), max);
    }
}
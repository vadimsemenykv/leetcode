class Solution {
    public int lengthOfLongestSubstring(String s) {
        //T: O(n) S: O(n)
        if (s.length() <= 1) {
            return s.length();
        }
        
        Map<Character, Integer> seen = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            Integer previouslySeenAt = seen.get(currentChar);
            
            if (previouslySeenAt != null && previouslySeenAt >= left) {
                left = previouslySeenAt + 1;
            }
            
            seen.put(currentChar, right);
            
            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }
}
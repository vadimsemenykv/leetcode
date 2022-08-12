class Solution {
    public boolean isPalindrome(int x) {
        var s = String.valueOf(x);
        var lp = 0;
        var rp = s.length() - 1;
        
        while (lp < rp) {
            if (s.charAt(lp) != s.charAt(rp)) return false;
            
            lp++;
            rp--;
        }
        
        return true;
    }
}
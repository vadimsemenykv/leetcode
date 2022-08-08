class Solution {
    public boolean validPalindrome(String s) {
        var pL = 0;
        var pR = s.length() - 1;
        
        while (pL < pR) {
            if (s.charAt(pL) != s.charAt(pR)) {
                return isSubStringValidPalindrome(s, pL + 1, pR)
                    || isSubStringValidPalindrome(s, pL, pR - 1);
            }
            
            pL++;
            pR--;
        }
        
        return true;
    }
    
    private boolean isSubStringValidPalindrome (String s, int pL, int pR) {
        while (pL < pR) {
            if (s.charAt(pL) != s.charAt(pR)) {
                return false;
            } 
            
            pL++;
            pR--;
        }
        
        return true;
    }
}
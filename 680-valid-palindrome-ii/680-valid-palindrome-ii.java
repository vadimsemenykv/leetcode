class Solution {
    public boolean validPalindrome(String s) {
        var pL = 0;
        var pR = s.length() - 1;
        var toRemove = 0;
        var stepsToReturn = 0;
        var checkLeftBranch = false;
        
        while (pL < pR) {
            if (s.charAt(pL) != s.charAt(pR)) {
                if (checkLeftBranch) {
                    pL = pL - stepsToReturn - 1;
                    pR = pR + stepsToReturn - 1;
                    stepsToReturn = 0;
                    checkLeftBranch = false;
                } else {
                    pL++;
                    checkLeftBranch = true;
                    toRemove++;
                }
            } else {
                pL++;
                pR--;
                if (checkLeftBranch) {
                    stepsToReturn++;
                }
            }
            
            if (toRemove > 1) {
                return false;
            }
        }
        
        return true;
    }
}
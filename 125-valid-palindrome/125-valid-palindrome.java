class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                
        //Compare reversed aproach
        // return s.equals(new StringBuilder().append(s).reverse().toString());
        
        var pL = 0;
        var pR = s.length() - 1;
        
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
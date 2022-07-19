class Solution {
    public int trap(int[] heights) {
        //2 Pointer solution
        if (heights.length < 3) {
            return 0;
        }
        
        int pL = 0;
        int pR = heights.length - 1;
        int maxL = 0;
        int maxR = 0;
        int total = 0;
        
        while (pL < pR) {
            if (heights[pL] <= heights[pR]) {
                if (heights[pL] >= maxL) {
                    maxL = heights[pL];
                } else {
                    total += maxL - heights[pL];
                }
                pL++;
            } else {
                if (heights[pR] >= maxR) {
                    maxR = heights[pR];
                } else {
                    total += maxR - heights[pR];
                }
                pR--;
            }
        }
        
        return total;
    }
}
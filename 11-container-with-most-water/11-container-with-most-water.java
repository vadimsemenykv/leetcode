class Solution {
    public int maxArea(int[] heights) {
        //2 Shifting pointers solution
        
        int maxArea = 0;
        int p1 = 0;
        int p2 = heights.length - 1;
        
        while (p1 < p2) {
            int height = height(heights[p1], heights[p2]);
            int width = width(p1, p2);
            int currentArrea = height * width;
            maxArea = maxArea < currentArrea ? currentArrea : maxArea;
            
            if (heights[p1] <= heights[p2]) {
                p1++;
            } else {
                p2--;
            }
        }
        
        return maxArea;
    }
    
    private int height(int leftHeight, int rightHeigth) {
        return leftHeight > rightHeigth ? rightHeigth : leftHeight;
    }
    
    private int width(int leftPointer, int rightPointer) {
        return rightPointer - leftPointer;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        var pointer = 0;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        
        for (var i = pointer; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
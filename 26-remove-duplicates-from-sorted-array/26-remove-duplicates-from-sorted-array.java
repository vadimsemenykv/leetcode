class Solution {
    public int removeDuplicates(int[] nums) {
        var insertIndex = 1;
        
        for (var i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        
        return insertIndex;
    }
}
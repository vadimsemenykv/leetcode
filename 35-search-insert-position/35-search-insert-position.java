class Solution {
    public int searchInsert(int[] nums, int target) {
        // Binary search
        int start = 0;
        int end = nums.length - 1;
        
        if (nums.length == 0 || nums[0] >= target) {
            return 0;
        }
        
        if (nums[end] == target) {
            return end;
        }
        
        if (nums[end] < target) {
            return end + 1;
        }
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            
            if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        
        return start;
    }
}
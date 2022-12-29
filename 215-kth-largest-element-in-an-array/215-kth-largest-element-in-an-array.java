class Solution {
    public int findKthLargest(int[] nums, int k) {
        sort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }
    
    private void sort(int[] nums, int low, int high) {
        if (low < high) {
            var pi = partition(nums, low, high);
            
            sort(nums, low, pi - 1);
            sort(nums, pi + 1, high);
        }
    }
    
    private int partition(int[] nums, int low, int high) {
        var pivot = nums[high];
        var i = low - 1;
        
        for (var j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, high);
        
        return i + 1;
    }
    
    private void swap(int[] nums, int i, int j) {
        var temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
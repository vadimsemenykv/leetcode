class QuickSort {
  public void sort (int[] nums) {
    return sort(nums, 0, nums.length - 1);
  }
  
  private void sort(int[] nums, int low, int high) {
        if (low < high) {
            var pivotIndex = partition(nums, low, high);
            
            sort(nums, low, pivotIndex - 1);
            sort(nums, pivotIndex + 1, high);
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

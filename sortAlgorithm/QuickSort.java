class QuickSort {
  public void sort (int[] nums) {
    return sort(nums, 0, nums.length - 1);
  }
  
  private void sort(int[] nums, int low, int high) {
    if (low < high) {
      var partitionIndex = partition(nums, low, high);

      sort(nums, low, partitionIndex - 1);
      sort(nums, partitionIndex + 1, high);
    }
  }
    
  private int partition(int[] nums, int low, int high) {
    var pivot = nums[high];
    var partitionIndex = low;

    for (var j = low; j < high; j++) {
      if (nums[j] < pivot) {
        swap(nums, partitionIndex, j);
        partitionIndex++;
      }
    }
    swap(nums, partitionIndex, high);

    return partitionIndex;
  }

  private void swap(int[] nums, int i, int j) {
    var temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}

class SelectionSort {
  public void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int k = i;
      for (int j = i + 1; j < arr.length; j ++) {
          if(arr[k] > arr[j]) {
              k = j;
          }
      }
      swap(arr, i, k);
    }
  }
  
  private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Memoization of {numberToFind, indexForWhichWeNeedThisNumber}
        if (nums == null || nums.length <= 1) {
            return null;
        }
        
        Map<Integer, Integer> processed = new HashMap<>();
        int p = 0;
        
        while (p < nums.length) {
            int numberToFind = target - nums[p];
            if (processed.containsKey(nums[p])) {
                return new int[] {p, processed.get(nums[p])};
            }
            processed.put(numberToFind, p);
            p++;
        }
        
        return null;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Memoization
        if (nums == null || nums.length <= 1) {
            return null;
        }
        if (nums.length == 2) {
            return (nums[0] + nums[1]) == target ? new int[] {0, 1} : null;
        }
        
        Map<Integer, Integer> processed = new HashMap<>();
        int p = 0;
        
        while (p < nums.length) {
            int numberToFind = target - nums[p];
            if (processed.containsKey(numberToFind)) {
                return new int[] {p, processed.get(numberToFind)};
            }
            processed.put(nums[p], p);
            p++;
        }
        
        return null;
    }
}
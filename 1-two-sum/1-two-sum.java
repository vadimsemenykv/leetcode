class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Brutforce
        //Two pointer solution
        if (nums == null || nums.length <= 1) {
            return null;
        }
        if (nums.length == 2) {
            return (nums[0] + nums[1]) == target ? new int[] {0, 1} : null;
        }
        
        int p1 = 0;
        int p2 = 0;
        
        while (p1 <= (nums.length - 2)) {
            p2 = p1 + 1;
            int numberToFind = target - nums[p1];
            while (p2 <= (nums.length - 1)) {
                if (nums[p2] == numberToFind) {
                    return new int[] {p1, p2};
                }
                p2++;
            }
            p1++;
        }
        
        return null;
    }
}
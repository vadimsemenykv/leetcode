class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1, -1};
        }

        int pos = search(nums, target, 0, nums.length - 1);
        if (pos == -1) {
            return new int[] {-1, -1};
        }

        int lp = pos;
        int rp = pos;
        int tmp = 0;
        
        while (lp != -1) {
            tmp = lp;
            lp = search(nums, target, 0, lp - 1);
        }
        lp = tmp;
        
        while (rp != -1) {
            tmp = rp;
            rp = search(nums, target, rp + 1, nums.length - 1);
        }
        rp = tmp;

        return new int[] {lp, rp};
    }

    public int search(int[] nums, int target, int lp, int rp) {        
        while (lp <= rp) {
            int mid = (lp + rp) / 2;
            if (nums[mid] == target) return mid;

            if (nums[mid] > target) rp = mid - 1;
            if (nums[mid] < target) lp = mid + 1;
        }

        return -1;
    }
}
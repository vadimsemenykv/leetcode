class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        var list = new LinkedList<Integer>();
        for (var i = 0; i < nums.length; i++) {
            var num = Math.abs(nums[i]);
            if (nums[num - 1] < 0) {
                list.add(num);
            } else {
                nums[num - 1] *= -1;
            }
        }
        return list;
    }
}
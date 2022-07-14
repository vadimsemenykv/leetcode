class Solution {
    public int[] twoSum(int[] nums, int target) {
        // O(n) time | O(n) space
        HashMap<Integer, Integer> myMap = new HashMap<>();
        
        // update map
        for(int i = 0; i < nums.length; i++)
            myMap.put(nums[i], i);
        
        for(int i = 0; i < nums.length; i++)
        {
            int found = target - nums[i];
            
            if(myMap.containsKey(found) && i != myMap.get(found))
                return new int[] {i, myMap.get(found)};
        }
        throw new IllegalArgumentException("No Solution !");
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        var set1 = fromArray(nums1);
        var set2 = fromArray(nums2);
        
        return (set1.size() < set2.size() ? intersect(set1, set2) : intersect(set1, set2))
            .stream()
            .mapToInt(i -> i)
            .toArray();
    }
    
    public Set<Integer> fromArray(int[] nums) {
        var set = new HashSet<Integer>();
        for (var num : nums) {
            set.add(num);
        }
        return set;
    }
    
    public Set<Integer> intersect(Set<Integer> small, Set<Integer> big) {
        var set = new HashSet<Integer>();
        for (var element : small) {
            if (big.contains(element)) set.add(element);
        }
        return set;
    }
}
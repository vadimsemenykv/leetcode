class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        var set1 = fromArray(nums1);
        var set2 = fromArray(nums2);
        
        var small = set1.size() < set2.size() ? set1 : set2;
        var big = set1.size() >= set2.size() ? set1 : set2;
        
        return intersect(small, big)
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
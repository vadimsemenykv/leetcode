class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsFrequence = new HashMap();
        List<List<Integer>> frequenceNums = new ArrayList();
        for (int i = 0; i <= nums.length; i++) { 
            frequenceNums.add(new LinkedList<Integer>());
        }
        
        for (int i = 0; i < nums.length; i++) { 
            var num = nums[i];
            var frequence = numsFrequence.get(num);
            if (frequence == null) {
                frequence = 1;
            } else {
                frequence++;
            }
            
            numsFrequence.put(num, frequence);   
        }
        
        
        for (Map.Entry<Integer, Integer> entry : numsFrequence.entrySet()) {
            frequenceNums.get(entry.getValue()).add(entry.getKey());
        }
        
        int[] result = new int[k];
        int j = 0;
        for (int i = frequenceNums.size() - 1; i >= 0 && j <= k; i--) {
            List<Integer> innerList = frequenceNums.get(i);
            if (innerList.size() > 0) {
                for (int val : innerList) {
                    if (j == k) {
                        break;
                    }
                    
                    result[j] = val;
                    j++;
                }
            }
        }
        
        return result;
    }
}
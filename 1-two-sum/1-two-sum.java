class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first=0;
        int second=1;
        
        int[] res=new int[2];
        boolean found=false;
        int sum=0;
                
        while(!found){
            if(second == nums.length){
                first++;
                second=first+1;
            }
            
            sum=nums[first]+nums[second];
            
            if(sum==target){
                res[0]=first;
                res[1]=second;
                found=true;
            }
            sum=0;
            second++;
        }
        
        return res;
    }
}
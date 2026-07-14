// Last updated: 7/14/2026, 2:15:45 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int subMax=0;
        for(int num: nums){
            subMax+=num;
            max=Math.max(max,subMax);
            if(subMax<0)subMax=0;
        }
        return max;
        
    }
}
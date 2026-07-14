// Last updated: 7/14/2026, 2:14:51 PM
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+1];
        for(int num:nums){
            arr[num]++;
            if(arr[num]>1){
                return num;
            }
        }
        return 0;
    }
}
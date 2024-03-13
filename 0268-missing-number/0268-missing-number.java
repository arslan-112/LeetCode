class Solution {
    public int missingNumber(int[] nums) {
        int rangesum = 0;
        int sum = 0;
        for(int i = 0,j = 1;i<nums.length;i++,j++){
            sum += j;
            rangesum += nums[i];
        }
        return sum-rangesum;
    }
}
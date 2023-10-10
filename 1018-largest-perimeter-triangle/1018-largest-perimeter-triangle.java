class Solution {
    public int largestPerimeter(int[] nums) {
        int largest = 0;
        Arrays.sort(nums);
        
        for(int i = nums.length-1; i>1;i--){
            if(nums[i] < nums[i-1] + nums[i-2]){
                largest = nums[i] + nums[i-1] + nums[i-2];
                break;
            }
        }
        return largest;
    }
}
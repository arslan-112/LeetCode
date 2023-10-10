class Solution {
    public int largestPerimeter(int[] nums) {
        int largest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for(int i = nums.length-1; i>1;i--){
            if(nums[i] < nums[i-1] + nums[i-2]){
                largest = nums[i] + nums[i-1] + nums[i-2];
                break;
            }
        }
        return largest;
    }
}
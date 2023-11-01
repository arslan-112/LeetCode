class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length > 1){
        int [] copy = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            copy[i] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[(i+k)%nums.length] = copy[i];
        }
        }
    }
}
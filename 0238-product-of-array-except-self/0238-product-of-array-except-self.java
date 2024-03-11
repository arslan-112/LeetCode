class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] answer = new int[nums.length];
        int right_prod[] = new int[nums.length];
        int left_prod[] = new int[nums.length];
        left_prod[0] = nums[0];
        right_prod[nums.length-1] = nums[nums.length-1];
        for(int i =1, j= nums.length-2; i<nums.length; i++,j--){
            left_prod[i] = left_prod[i-1] * nums[i];
            right_prod[j] = right_prod[j+1] * nums[j];
        }
        answer[0] = right_prod[1];
        answer[nums.length-1] = left_prod[nums.length-2];
        for(int i=1; i<nums.length-1; i++){
            answer[i] = left_prod[i-1] * right_prod[i+1];
        }
        return answer;
    }
}
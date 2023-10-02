class Solution {
    public int[] runningSum(int[] nums) {
        int [] sumArr = new int [nums.length];
        for(int i =0, j=0; i <nums.length;i++){
            while(j<=i)
                sumArr[i] += nums[j++];
            j=0;
        }
        return sumArr;
    }
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] shuffled = new int[nums.length];
        for(int i=0, j = 0;i<nums.length;i++){
            if(i%2 == 0){
                shuffled[i] = nums[j++]; 
            }else{
                shuffled[i] = nums[n++]; 
            }
                
        }
        return shuffled;
    }
}
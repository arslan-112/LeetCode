class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        int [] shuffled = new int[size];
        int j = 0;
        for(int i=0;i<size;i++){
            if(i%2 == 0){
                shuffled[i] = nums[j]; j++;
            }else{
                shuffled[i] = nums[n]; n++;
            }
                
        }
        return shuffled;
    }
}
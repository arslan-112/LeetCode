class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];   //Move the pointer twice as fast
        }while(slow != fast);          //When false, the two pointers have intersected
        int slow2 = 0;                 
        do{
            slow = nums[slow];
            slow2 = nums[slow2];
        }while(slow != slow2);          //The point at which they meet is the duplicate number
        return slow;
    }
}
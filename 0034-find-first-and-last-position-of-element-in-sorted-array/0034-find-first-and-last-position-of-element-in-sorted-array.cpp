class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int start = 0;
        int end = nums.size()-1;
        bool flag = false;
        int lower = -1, upper = -1;
        vector <int> ans;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] <target)
                start = mid+1;
            else if(nums[mid] > target)
                end = mid -1;
            else{
                lower = mid;
                upper = mid;
                for (int i = mid - 1; i >= 0 && nums[i] == target; i--) {
                    lower = i;
                }
                for (int j = mid + 1; j < nums.size() && nums[j] == target; j++) {
                    upper = j;
                }
                break;
            }
        }
        ans.push_back(lower);
        ans.push_back(upper);
        return ans;
            
    }
};
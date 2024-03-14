class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        if(n == 0)
            return;
        for(int i=0, j =m; i<n;i++){
            nums1[j++] = nums2[i];
        }
        for(int i = 0; i<m+n-1;i++){
            for(int j =0; j<m+n-1-i;j++){
                if(nums1[j] > nums1[j+1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }
    }
};
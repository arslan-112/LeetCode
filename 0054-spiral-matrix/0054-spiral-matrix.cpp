class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> ans;
        if (matrix.empty() || matrix[0].empty()) {
            return ans; // Handle empty matrix
        }

        int left = 0, right = matrix[0].size() - 1, top = 0, bottom = matrix.size() - 1;
        
        while (left <= right && top <= bottom){
            //left to right
            for(int i=left; i<=right;i++){
                ans.push_back(matrix[top][i]);
            }
            top++;
            //top to bottom
            for(int i= top;i<=bottom;i++){
                ans.push_back(matrix[i][right]);
            }
            right--;
            //right to left
            if(top<=bottom){
                for(int i= right; i>=left;i--){
                    ans.push_back(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i =bottom; i>=top;i--){
                    ans.push_back(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
};
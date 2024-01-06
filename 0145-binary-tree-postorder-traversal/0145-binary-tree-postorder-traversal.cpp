/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int> ans;
        if(root == NULL)
            return ans;
        stack<TreeNode*> s;
        TreeNode* curr = root;
        while(curr || !s.empty()){
            if(curr){
                s.push(curr);
                curr = curr->left;
            }else{
                TreeNode* temp = s.top()->right;
                if(!temp){
                    temp = s.top();
                    s.pop();
                    ans.push_back(temp->val);
                    while(!s.empty() && s.top()->right == temp){
                        temp = s.top(); s.pop();
                        ans.push_back(temp->val);
                    }
                }else
                    curr = temp;
            }
        }
        return ans;
    }
};
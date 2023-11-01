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
    vector<int> findMode(TreeNode* root) {
        vector<int>Inorder;
        inorder(root,Inorder);
        unordered_map<int,int> freqs;
        int Max = 0;
        for(int val: Inorder){
            freqs[val]++;
            Max = max(Max,freqs[val]);
        }
        vector<int> result;
        for (const auto& pair : freqs) {
            if (pair.second == Max) {
                result.push_back(pair.first);
            }
        }
        
        return result;


    }
    void inorder(TreeNode* root, vector<int>&result){
        if(root){
            inorder(root->left,result);
            result.push_back(root->val);
            inorder(root->right,result);
        }else
            return;
    }

    
};
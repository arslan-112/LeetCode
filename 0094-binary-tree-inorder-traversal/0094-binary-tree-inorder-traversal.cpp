class Solution {
public:
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> result;
        stack<TreeNode*> st;
        TreeNode* curr = root;
        
        while (curr != nullptr || !st.empty()) {
            // Traverse left subtree and push nodes onto the stack
            while (curr != nullptr) {
                st.push(curr);
                curr = curr->left;
            }
            
            // Visit the current node (root) and move to the right subtree
            curr = st.top();
            st.pop();
            result.push_back(curr->val);
            curr = curr->right;
        }
        
        return result;
    }
};
 
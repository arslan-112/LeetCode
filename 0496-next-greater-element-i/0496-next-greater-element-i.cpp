class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        map<int,int> m;
        stack<int> s;
        for(int i=nums2.size()-1;i>=0;i--){
            int x = nums2[i];
            while(!s.empty() && s.top()<=x)
                s.pop();
            int ans = (s.empty())? -1:s.top();
            m[x] = ans;
            s.push(x);
        }
        vector<int> res;
        for(int i=0;i<nums1.size();i++){
            res.push_back(m[nums1[i]]);
        }
        return res;
    }
};


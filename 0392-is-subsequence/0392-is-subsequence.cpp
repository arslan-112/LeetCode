class Solution {
public:
    bool isSubsequence(string s, string t) {
        int occ = 0;
        for(int i=0; i<t.size(); i++){
            if(s[occ] == t[i])
                occ++;
        }
        return (occ == s.size());
    }
   
};
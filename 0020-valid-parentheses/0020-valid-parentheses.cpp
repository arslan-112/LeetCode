#include <stack>
class Solution {
public:
    bool isValid(string s) {
        stack <char> S;
        for(char ch: s){
            if(ch == '(' || ch == '{' || ch == '['){
            S.push(ch);
        }
        else if(ch == ')' || ch == '}' || ch == ']'){
            if(S.empty()){
                return false;
            }
        else if((ch == ')' && S.top() != '(') || (ch == '}' && S.top() != '{') || ch == ']' && S.top() != '['){
            return false;
        }
        else
        S.pop();
    }
        }
    if(S.empty())
        return true;
    return false;

    }
};
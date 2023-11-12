#include <stack>
class Solution {
public:
    int calPoints(vector<string>& operations) {
        int sum =0;
        stack<int> mystack;
        for (const auto& op : operations) {
        if ((op[0] == '-' && isdigit(op[1])) || isdigit(op[0])) {
            mystack.push(std::stoi(op));
        } else if (op == "+") {
            int op1 = mystack.top();
            mystack.pop();
            int op2 = mystack.top();
            mystack.pop();
            mystack.push(op2);
            mystack.push(op1);
            mystack.push(op2 + op1);
            
        } else if (op == "D") {
            int op = mystack.top();
            mystack.push(op * 2);
        } else if (op == "C") {
            mystack.pop();
        }
    }
        while(!mystack.empty()){
            sum += mystack.top();
            mystack.pop();
        }
        return sum;
    }
};
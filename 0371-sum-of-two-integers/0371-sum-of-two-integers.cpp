class Solution {
public:
    int getSum(int a, int b) {
        int carry,sum;
        do{
            sum = a ^ b;
            carry = (a&b) << 1;
            
            a = sum;
            b = carry;
        }while(b!=0);
        return a;
        
    }
};
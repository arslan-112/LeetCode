class Solution {
    public int[] plusOne(int[] digits) {
        
        int size = digits.length;
        int newArr1 [] = new int[2];
        if(size == 1){
            if(digits[0] == 9){
                newArr1[0] = 1;
                newArr1[1] = 0;
                return newArr1;
            }else{
                digits[0]++;
                return digits;
            }
        }
        else{
            
            if(digits[size-1] == 9){
                boolean carry;
                digits[size-1] = 0;
                carry = true;
                for(int i=size-2;i>=0;i--){
                    if(digits[i] ==9)
                        digits[i] = 0;
                    else{
                        digits[i]++;
                        carry = false;
                        break;
                    }
                }
                if(carry){
                    int []newArr = new int[size+1];
                    newArr[0] = 1;
                    for(int i = 0; i <size-1;i++){
                        newArr[i+1] = digits[i];
                    }
                    return newArr;
                }else{
                    return digits;
                }
            }
            else{
                digits[size-1]++;
                return digits;
            }
        }


    }
}
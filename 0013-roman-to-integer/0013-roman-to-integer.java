class Solution {
    public int checkSymbol(char ch){
        switch(ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return 0;
    }
    
    
    
    public int romanToInt(String s) {
        char ch[] = s.toCharArray();
        int num = 0;
        int prev = 0;
        for(int i =0; i<ch.length;i++){
            int curr = checkSymbol(ch[i]);
            if(curr > prev){
                num += curr - prev;
                num -= prev;
            }
            else 
                num += curr;
            prev = curr;
        }
        return num;

    }
}
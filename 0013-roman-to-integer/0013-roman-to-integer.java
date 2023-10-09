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
    public boolean subtract(int prev, int curr){
        if(prev == 1 &&(curr == 5 || curr == 10))
            return true;
        else if ( prev == 10 &&(curr == 50 || curr == 100))
            return true;
        else if (prev == 100 &&(curr == 500 || curr == 1000))
            return true;
        return false;
    }
    
    public int romanToInt(String s) {
        char ch[] = s.toCharArray();
        int num = 0;
        int prev = 0;
        for(int i =0; i<ch.length;i++){
            if(subtract(prev,checkSymbol(ch[i]))){
                num += checkSymbol(ch[i]) - prev;
                num -= prev;
            }
            else 
                num += checkSymbol(ch[i]);
            prev = checkSymbol(ch[i]);
        }
        return num;

    }
}
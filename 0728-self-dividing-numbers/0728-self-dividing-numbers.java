class Solution {
    public boolean Selfdivide(int Onum){
        int num = Onum;
        
        boolean divides = true;
        while (num >0){
            int rem = num%10;
            if(rem == 0){
                return false;        
            }
            num/=10;
            if (Onum%rem !=0){
                return false;
            }
            
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=left; i<=right;i++){
            if(Selfdivide(i)){   //Used the function to improve run time
                list.add(i);     //Without function runtime was 3ms
            }
        }
        return list;
    }
}

class Solution {
    // public boolean Selfdivide(int Onum){

    // }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=left; i<=right;i++){
            
            int num = i;
            int rem = 0;
            boolean divides = true;
            while (num >0){
                rem = num%10;
                if(rem == 0){
                    divides = false;
                    break;
                }
                num/=10;
                if (i%rem !=0){
                    divides = false;
                    break;
                }
            }
            if(divides){
                list.add(i);
            }
        }
        return list;
    }
}
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=left; i<=right;i++){
            if(i%10 == 0){
                continue;}
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
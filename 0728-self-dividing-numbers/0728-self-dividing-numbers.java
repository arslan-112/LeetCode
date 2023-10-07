class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=left; i<=right;i++){
            char [] chars = String.valueOf(i).toCharArray();
            boolean divides = true;
            for(char ch : chars){
                if(ch =='0' || i%Integer.parseInt(String.valueOf(ch)) != 0 ){
                divides = false;
                break;
                }
            }
            if(divides)
            list.add(i);
        }
        return list;
    }
}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i] > max)
                max = candies[i];
        }
        List <Boolean> arr = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            arr.add(candies[i] + extraCandies >= max);
        }
        return arr;
    }
}
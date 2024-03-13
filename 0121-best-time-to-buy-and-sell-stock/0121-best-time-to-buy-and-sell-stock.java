class Solution {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int max = 0;
        int curr_prof = 0;
        for(int i=0; i<prices.length;i++){
            if(prices[i] < lowest)
                lowest = prices[i];
            curr_prof = prices[i] - lowest;
            if(curr_prof > max)
                max = curr_prof;
        }
        return max;
    }
}
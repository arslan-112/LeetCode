class Solution {
    public double average(int[] salary) {
        double total = 0;
        double highest = 0;
        double lowest = 100000000;
        for(int i =0; i<salary.length;i++){
            total += salary[i];
            if(salary[i] > highest)
                highest = salary[i];
            if(salary[i] < lowest)
                lowest = salary[i];
        }
        total -= (highest+lowest);
        return total/(salary.length-2);
    }
}
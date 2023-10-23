/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int low = 1;
        int high = n;
        int guess1 =0;
        while(low<=high){
            guess1 =low + (high-low)/2;
            if(guess(guess1) == -1)
            high = guess1 -1;
            else if(guess(guess1) == 1)
            low = guess1 +1;
            else
                return guess1;
        }
        return -1;
    }
}
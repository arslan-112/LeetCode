#include <cctype>
class Solution {
public:
    string reverseVowels(string s) {
        int low = 0; int high = s.length() -1;
        while(low <= high){
            
            if(isVowel(s[low]) && isVowel(s[high])){
                    char temp = s[low];
                    s[low] = s[high];
                    s[high] = temp;
                    low++;
                    high--;
            }else if(isVowel(s[low]) && !isVowel(s[high])){
                high--;
            }else if(isVowel(s[high]) && !isVowel(s[low])){
                low++;
            }else{
                low++;
                high--;
            }
            }
            return s;
        }
    bool isVowel(char s){
        s = tolower(s);
        if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u')
            return true;
        return false;
    }
};
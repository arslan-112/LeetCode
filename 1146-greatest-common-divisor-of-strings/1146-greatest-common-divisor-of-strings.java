class Solution {
    public String gcdOfStrings(String str1, String str2) {
       if(!(str1+str2).equals(str2+str1)) return "";
       int GCD = gcd(str1.length(),str2.length());
       return str2.substring(0,GCD); 
    }
    private int gcd(int x, int y) {
        while (y > 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
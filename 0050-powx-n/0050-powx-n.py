class Solution:
    def myPow(self, x: float, n: int) -> float:
        
        if n<0:
            x = 1/x
            
        pow = 1
        val = abs(n)
        while val != 0:
            if val & 1 !=0:
                pow *= x
            x*=x
            val>>=1
            
            
        return pow
            
            
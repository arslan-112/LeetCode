class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        maxprod = float('-inf')
        prod = 1
        for i in nums:
            prod*=i
            maxprod = max(prod,maxprod)
            if prod ==0:
                prod =1
        prod = 1
        for i in reversed(nums):
            prod*=i
            maxprod = max(prod,maxprod)
            if(prod ==0):
                prod =1
            
        return maxprod
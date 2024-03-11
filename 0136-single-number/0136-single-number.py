class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        set1 = set()
        for i in nums:
            if i not in set1:
                set1.add(i)
            elif i in set1:
                set1.remove(i)
        
        return set1.pop()
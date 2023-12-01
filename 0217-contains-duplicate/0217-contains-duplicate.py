class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        dict1 = {}
        for i in nums:
            if i in dict1:
                return True
            else:
                dict1[i] = 1
                
        return False
        
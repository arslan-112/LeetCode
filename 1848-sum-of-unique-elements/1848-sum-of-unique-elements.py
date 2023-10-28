class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        dict1 = {}
        for i in nums:
            if i not in dict1:
                dict1[i] = 1
            else:
                dict1[i] += 1
        sum = 0
        for val in dict1:
            if dict1[val] == 1:
                sum+= val
        return sum
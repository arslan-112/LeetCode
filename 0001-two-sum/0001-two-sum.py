class Solution(object):
    def twoSum(self, nums, target):
        dict1 = dict()
        for i,x in enumerate(nums):
            complement = target - x
            if complement in dict1:
                return[dict1[complement],i]
            dict1[x] = i
        return []
            
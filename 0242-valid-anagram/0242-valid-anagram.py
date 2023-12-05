class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        dict1 = {}
        dict2 = {}
        for i in s:
            if i in dict1:
                dict1[i] += 1
            else:
                dict1[i] = 1
        for x in t:
            if x in dict2:
                dict2[x] += 1
            else:
                dict2[x] = 1
        
        
        return dict1 == dict2
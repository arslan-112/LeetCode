class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        dict = {}
        for i in range(len(heights)):
            dict.update({heights[i]:names[i]})
        keys1 = list(dict.keys())
        keys1.sort(reverse = True)
        dict1 = {i: dict[i] for i in keys1}
        return list(dict1.values())
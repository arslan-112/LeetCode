class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        list1 = [n for n, h in sorted(zip(names,heights), key = lambda x: x[1],reverse = True)]

        return list1

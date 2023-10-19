class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        frequency = {}
        for i in arr:
            if i in frequency:
                frequency[i] += 1
            else:
                frequency[i] = 1
        values = list(frequency.values())
        return len(set(values)) == len(values)

        
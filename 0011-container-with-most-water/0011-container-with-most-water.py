class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        maxArea = 0
        while left < right:
            area = (right-left)*min(height[left],height[right])
            maxArea = max(area,maxArea)
            if height[right] < height[left]:
                right -=1
            else:
                left +=1
                
        return maxArea
            
        
    
    
class Solution:
    def isPalindrome(self, s: str) -> bool:
        start = 0
        end = len(s)-1
        while start <= end:
            if not s[start].isalnum():
                start +=1
            elif not s[end].isalnum():
                end -=1
            elif s[start].lower() != s[end].lower():
                return False
            else:
                start += 1
                end -= 1
                
        return True
        
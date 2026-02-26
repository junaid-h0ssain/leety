#
# @lc app=leetcode id=9 lang=python3
#
# [9] Palindrome Number
#

# @lc code=start
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        if x < 10:
            return True
        if x % 10 == 0:
            return False
        
        d = 1
        while x > 10 * d:
            d = d * 10

        while x:
            r = x%10
            l = x//d

            if r!=l:
                return False
            
            x = (x % d) // 10
            d = d//100
        
        return True
        
# @lc code=end


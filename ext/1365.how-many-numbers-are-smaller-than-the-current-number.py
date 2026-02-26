#
# @lc app=leetcode id=1365 lang=python3
#
# [1365] How Many Numbers Are Smaller Than the Current Number
#

# @lc code=start
class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        
        arr = []
        c = 0
        for i in range(len(nums)):
            
            c=0
            for j in range(len(nums)):
                if nums[i]>nums[j]:
                    c = c+1
            arr.append(c)

        return arr


# @lc code=end


/*
 * @lc app=leetcode id=1365 lang=golang
 *
 * [1365] How Many Numbers Are Smaller Than the Current Number
 */

// @lc code=start
func smallerNumbersThanCurrent(nums []int) []int {
    var arr = []int{}
	c := 0

	for i := 0; i<len(nums); i++{
		c = 0
		for j := 0; j<len(nums); j++{
			if nums[i]>nums[j]{
				c=c+1
			}
			
		}
		arr = append(arr, c)
	}

	return arr
}
// @lc code=end


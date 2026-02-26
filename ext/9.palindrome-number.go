/*
 * @lc app=leetcode id=9 lang=golang
 *
 * [9] Palindrome Number
 */

// @lc code=start
func isPalindrome(x int) bool {
	if x<0 {
		return false
	}

	if x<10 {
		return true
	}

	if x%10 == 0 {
		return false
	}

	d := 1

	for x>10*d {
		d *=10
	}

	for x>0 {
		if x%10 != x/d {
			return false
		}

		x = (x%d)/10
		d /= 100
	}

    return true
}
// @lc code=end


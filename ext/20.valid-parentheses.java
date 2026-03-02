/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty()) return true;
        if (s.length() == 1) return false;
        int n = s.length();
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            if(s.isEmpty()) return true;
        }
        return s.length() == 0;
    }
}
// @lc code=end


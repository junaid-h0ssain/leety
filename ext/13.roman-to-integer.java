/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {

        int r = 0;
        
        for(int i=0;i<s.length();i++){
            
            switch(s.charAt(i)){
                case 'I':
                    if(i+1 < s.length()){
                        if(s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'){
                            r -= 1;
                            break;
                        }
                    }
                    r += 1;
                    break;
                case 'V':
                    r += 5;
                    break;
                case 'X':
                    if(i+1 < s.length()){
                        if(s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'){
                            r -= 10;
                            break;
                        }
                    }
                    r += 10;
                    break;
                case 'L':
                    r += 50;
                    break;
                case 'C':
                    if(i+1 < s.length()){
                        if(s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'){
                            r -= 100;
                            break;
                        }
                    }
                    r += 100;
                    break;
                case 'D':
                    r += 500;
                    break;
                case 'M':
                    r += 1000;
                    break;
            }
        }
        return r;
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(i+1%3==0 && i+1%5==0){
                arr.add("FizzBuzz");
            }else if(i+1%3==0){
                arr.add("Fizz");
            }else if(i+1%5==0){
                arr.add("Buzz");
            }else{
                arr.add(Integer.toString(i));
            }
        }
    }
}
// @lc code=end


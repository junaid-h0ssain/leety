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
        for (int i = 1; i < n+1; i++) {
            if(i%3==0 && i%5==0){
                arr.add("FizzBuzz");
            }else if(i%3==0){
                arr.add("Fizz");
            }else if(i%5==0){
                arr.add("Buzz");
            }else{
                arr.add(Integer.toString(i));
            }
        }
        return arr;
    }
}
// @lc code=end


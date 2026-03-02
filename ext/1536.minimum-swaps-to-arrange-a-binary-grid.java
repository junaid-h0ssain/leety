/*
 * @lc app=leetcode id=1536 lang=java
 *
 * [1536] Minimum Swaps to Arrange a Binary Grid
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        
        HashMap<String,Integer>Map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(grid[i][j]);
            }
            String s = sb.toString();
            Map.put(s, Map.getOrDefault(s, 0)+1);
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n-i-1;j++){
                sb.append("0");
            }
            for(int j=n-i-1;j<n;j++){
                sb.append("1");
            }
            String s = sb.toString();
            if(Map.containsKey(s)){
                Map.put(s, Map.get(s)-1);
                if(Map.get(s)==0){
                    Map.remove(s);
                }
            }else{
                ans++;
            }
        }    
        return ans; 
    }
    
}
// @lc code=end


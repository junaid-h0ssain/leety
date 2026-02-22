package javatest;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int [] nums = {3,2,4};
        int target = 6;
        Solution s = new Solution();
        int [] result = s.twoSumMap(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}

class Solution {
    public int[] twoSumArray(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    int arr [] = {i,j};
                    return arr;
                }
            }
        }
        return null;
    }

    public int[] twoSumMap(int[] nums, int target){

        HashMap<Integer, Integer> nmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(nmap.containsKey(complement)){
                int arr [] = {nmap.get(complement), i};
                return arr;
            }
            nmap.put(nums[i], i);
        }

        return null;
    }
}
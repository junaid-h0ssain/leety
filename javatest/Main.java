package javatest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = {1,2,3,4,5};
        boolean result = s.containsDuplicate(nums);
        System.out.println("Contains duplicate: " + result);
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

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> n = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            n.add(nums[i]);
        }
        if(n.size()<nums.length)
            return true;
        return false;
    }
}
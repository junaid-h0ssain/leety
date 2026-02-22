package javatest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = s.findDisappearedNumbers(nums);
        System.out.println("Missing numbers: " + result);
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

    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> n = new HashSet<>();

        for(int i=1;i<nums.length;i++){
            n.add(nums[i]);
        }   

        for(int i=1; i<nums.length;i++){
            if(!n.contains(i)){
                arr.add(i);
            }
        }

        return arr;
    }
}
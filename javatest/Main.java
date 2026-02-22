package javatest;

public class Main {
    public static void main(String[] args) {
        int [] nums = {3,2,3};
        int target = 6;
        Solution s = new Solution();
        int [] result = s.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
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
}
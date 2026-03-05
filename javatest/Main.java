package javatest;

import java.util.*;

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

  
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // Dummy head node:
        // In Java, `ListNode` variables store references to objects (pointer-like behavior).
        // `h` points to this first placeholder node so building the result list is easier.
        // Real digits are added after this node, so the method returns `h.next`.
        ListNode h = new ListNode(0);
        ListNode p = h;
        int c = 0;
        while(l1 != null || l2 != null || c != 0){
            int sum = c;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            c = sum / 10;
            p.next = new ListNode(sum % 10);
            p = p.next;
        }
        return h.next;
    }

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] ans = new int[2*n];  
        for(int i=0;i<2*n;i++){
            ans[i] = nums[i%n];
        }
        return ans;   
    }

    public int minOperations(String s) {

        int n = s.length();
        if(!s.contains("0")){
            return n/2;
        }
        if(!s.contains("1")){
            return n/2;
        }
        char[] c = s.toCharArray();

        char[] u = new char[n];
        char[] v = new char[n];


        for (int i = 0; i < n-1; i+=2) {
            u[i]='0';
            u[i+1]='1';
            v[i]='1';
            v[i+1]='0';
        }
        if(n%2!=0){
            u[n-1]='0';
            v[n-1]='1';
        }

        System.out.println(Arrays.toString(c) + "\n" + Arrays.toString(v));
        int a = 0;
        int b = 0;
        for(int i = 0; i<n; i++){
            if(c[i]!=u[i]) a+=1;
            if(c[i]!=v[i]) b+=1;
        }
        return Math.min(a, b);
    }
}
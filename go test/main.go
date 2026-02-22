package main


import (	
	"fmt"
)

func twoSum(nums []int, target int) []int {
	// nmap stores each number and its corresponding index for quick lookup
	nmap := make(map[int]int)
	// Iterate through each number in the input slice with its index
	for i, num := range nums {
		// Check if the complement (target - current number) exists in the map
		if j, ok := nmap[target-num]; ok {
			// If complement found, return the indices of both numbers
			return []int{j, i}
		}
		// Store the current number and its index in the map for future lookups
		nmap[num] = i
	}
	// No two numbers found that sum to target
	return nil
}

func main() {
	nums := []int{3,3}
	target := 9
	result := twoSum(nums, target)
	fmt.Println(result) // Output: [0, 1]
}

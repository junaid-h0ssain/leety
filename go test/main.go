package main

import (
	"fmt"
	"sort"

)

func twoSumArray(nums []int, target int) []int {
	n := len(nums)
	for i := 0; i < n; i++ {
		for j := i + 1; j < n; j++ {
			if nums[i]+nums[j] == target {
				arr := []int{i, j}
				return arr
			}
		}
	}
	return nil
}

func twoSumMap(nums []int, target int) []int {
	// nmap stores each number and its corresponding index for quick lookup
	nmap := make(map[int]int)
	for i, num := range nums {
		if j, ok := nmap[target-num]; ok {
			return []int{j, i}
		}
		nmap[num] = i
	}
	return nil
}

func containsDuplicate(nums []int) bool {
	sort.Ints(nums)
	n := len(nums)
	for i := 1; i < n; i++ {
		if nums[i] == nums[i-1] {
			return true
		}
		fmt.Println(nums[i])
	}
	return false
}

func main() {
	nums := []int{6, 2, 3, 6}
	result := containsDuplicate(nums)
	fmt.Println(result)
}

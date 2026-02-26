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

func findDisappearedNumbers(nums []int) []int {
    
	n := len(nums)
	nmap := make(map[int]bool)
	for _, num := range nums {
		nmap[num] = true
	}
	arr := []int{}
	for i := 1; i <= n; i++ {
		if !nmap[i] {
			arr = append(arr, i)
		}
	}
	return arr
}

func main() {
	nums := []int{1,1}
	result := findDisappearedNumbers(nums)
	fmt.Println(result)
}

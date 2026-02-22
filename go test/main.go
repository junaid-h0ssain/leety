package main


import (	
	"fmt"
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
		if j, ok := nmap[target-num]; ok{
			return []int{j,i}
		}
		nmap[num]=i
	}
	return nil
}

func containsDuplicateArray(nums []int) bool {
	
    n := len(nums)
	for i := range n {
		for j := range n {
			if i==j{
				return true
			}
		}
	}
	return false
}

func main() {
	nums := []int{3,2,4,3}
	result := containsDuplicateArray(nums)
	fmt.Println(result)
}

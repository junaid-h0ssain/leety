

func twoSum(nums []int, target int) []int {
        n := len(nums)
        for i :=0 ; i<n ; i++{
            for j :=i+1 ; j<n ;j++{
                if(nums[i]+nums[j]==target){
                    arr :=  []int{i,j}
                    return arr
                }
            }
        }
        return nil
}
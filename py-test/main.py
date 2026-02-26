from typing import List


class Solution:
    
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nmap = {}
        for i, num in enumerate(nums):
            if target - num in nmap:
                return [nmap[target - num], i]
            nmap[num] = i
            print(nmap)
    
    def containsDuplicate(self, nums: List[int]) -> bool:
        nmap = {}
        for i, num in enumerate(nums):
            if num in nmap:
                return True
            nmap[num] = i
        return False
    
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        count = [0] * 101
        # print(count)
        
        # Count frequency
        for num in nums:
            count[num] += 1
            # print(count[num])
        
        # Prefix sum
        for i in range(1, 101):
            count[i] += count[i - 1]
          
        
        result = []
        for num in nums:
            print(num)
            if num == 0:
                result.append(0)
            else:
                result.append(count[num - 1])

        print
        
        return result
    
    
        
    

def main():
    print("Hello from py-test!\n")
    x = Solution().smallerNumbersThanCurrent([8,1,2,2,3])
    print(x)
   
    


if __name__ == "__main__":
    main()

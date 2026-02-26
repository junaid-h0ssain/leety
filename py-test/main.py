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
    
    
        
    

def main():
    print("Hello from py-test!\n")
    x = Solution().containsDuplicate([1,1])
    print(x)
   
    


if __name__ == "__main__":
    main()

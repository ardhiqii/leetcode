class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count = 0
        for num in nums:
            strNum = str(num)
            if len(strNum) % 2 == 0:
                count += 1 
        return count
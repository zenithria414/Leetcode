class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen = {num:False for num in nums}
        for num in nums:
            if seen[num]:
                return True
            seen[num]=True
        return False
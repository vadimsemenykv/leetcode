import json
import typing

'''
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
'''


class Solution:
    def twoSum(self, nums: typing.List[int], target: int) -> typing.List[int]:
        if len(nums) <= 1:
            return []

        buff_dict = {}
        for i in range(len(nums)):
            if 0 < target < nums[i]:
                return []
            if nums[i] in buff_dict:
                return [buff_dict[nums[i]] + 1, i + 1]
            else:
                buff_dict[target - nums[i]] = i

        return []


def string_to_integer_list(list_str: str):
    return json.loads(list_str)


def integer_list_to_string(nums: typing.List):
    len_of_list = len(nums)
    return json.dumps(nums[:len_of_list])


def read_lines():
    lines = ['[2, 7, 11, 15]', 9]
    for line in lines:
        yield line


def main():
    lines = read_lines()
    while True:
        try:
            line = next(lines)
            nums = string_to_integer_list(line)
            line = next(lines)
            target = int(line)

            ret = Solution().twoSum(nums, target)

            out = integer_list_to_string(ret)
            print(out)
        except StopIteration:
            break


if __name__ == '__main__':
    main()

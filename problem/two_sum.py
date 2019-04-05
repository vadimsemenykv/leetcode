import json
import typing

'''
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
'''


class Solution:
    def twoSum(self, nums: typing.List[int], target: int) -> typing.List[int]:
        if len(nums) <= 1:
            return []

        buff_dict = {}
        for i in range(len(nums)):
            if nums[i] in buff_dict:
                return [buff_dict[nums[i]], i]
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

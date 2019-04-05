import typing

'''
Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

Example 1:

Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9

Output: True
 

Example 2:

Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28

Output: False
'''


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def findTarget(self, root: TreeNode, k: int) -> bool:
        if not root:
            return False

        return self._find_target(root, set(), k)

    def _find_target(self, node: TreeNode, nodes: typing.Set, k: int) -> bool:
        if not node:
            return False

        if k - node.val in nodes:
            return True

        nodes.add(node.val)

        return self._find_target(node.left, nodes, k) or self._find_target(node.right, nodes, k)


def string_to_tree_node(input_str: str):
    input_str = input_str.strip()
    input_str = input_str[1:-1]
    if not input_str:
        return None

    input_values = [s.strip() for s in input_str.split(',')]
    root = TreeNode(int(input_values[0]))
    node_queue = [root]
    front = 0
    index = 1
    while index < len(input_values):
        node = node_queue[front]
        front = front + 1

        item = input_values[index]
        index = index + 1
        if item != "null":
            left_number = int(item)
            node.left = TreeNode(left_number)
            node_queue.append(node.left)

        if index >= len(input_values):
            break

        item = input_values[index]
        index = index + 1
        if item != "null":
            right_number = int(item)
            node.right = TreeNode(right_number)
            node_queue.append(node.right)
    return root


def read_lines():
    lines = ['[5,3,6,2,4,null,7]', 9]
    for line in lines:
        yield line


def main():
    lines = read_lines()
    while True:
        try:
            line = next(lines)
            root = string_to_tree_node(line)
            line = next(lines)
            k = int(line)

            ret = Solution().findTarget(root, k)

            out = ret
            print(out)
        except StopIteration:
            break


if __name__ == '__main__':
    main()

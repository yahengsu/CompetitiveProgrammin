# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def zigzagLevelOrder(self, root):
        if root is None:
            return []
        
        node_q = deque([root, None])
        level_list = deque()
        zz = []
        
        isLR = True
        
        while len(node_q) > 0:
            curr = node_q.popleft()
            
            if curr:
                if isLR:
                    level_list.append(curr.val)
                else:
                    level_list.appendleft(curr.val)

                if curr.left:
                    node_q.append(curr.left)
                if curr.right:
                    node_q.append(curr.right)
            else:
                zz.append(level_list)
                level_list = deque()
                if len(node_q) > 0:
                    node_q.append(None)
                isLR = not isLR
                
                
        return zz
            
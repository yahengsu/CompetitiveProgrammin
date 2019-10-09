from collections import deque


def topView(root):
    # Write your code here
    q = deque()
    vals = []

    temp = root
    vals.append(root.info)
    q.append(temp)

from collections import deque


def topView(root):
    # Write your code here
    stack = []
    vals = deque()
    temp = root
    vals.append(root.info)
    while temp:

    print(" ".join(stack))

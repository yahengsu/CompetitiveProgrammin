def levelOrder(root):
    # Write your code here
    q = deque()
    temp = root
    q.append(temp)
    while len(q) > 0:
        temp = q.popleft()
        print(temp.info, end=" ")
        if temp.left:
            q.append(temp.left)
        if temp.right:
            q.append(temp.right)

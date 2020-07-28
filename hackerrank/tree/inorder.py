def inOrder(root):
    # Write your code here
    if root is None:
        return
    inOrder(root.left)
    print(root, end=" ")
    inOrder(root.right)

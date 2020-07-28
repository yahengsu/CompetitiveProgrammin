def preOrder(root):
    # Write your code here
    if root is None:
        return
    print(root, end=" ")
    preOrder(root.left)
    preOrder(root.right)

def decodeHuff(root, s):
        # Enter Your Code Here
    ptr = root
    st = ""

    for c in s:
        if c == "0":
            ptr = ptr.left
        elif c == "1":
            ptr = ptr.right

        if ptr.left is None and ptr.right is None:
            st += ptr.data
            ptr = root

    print(st)

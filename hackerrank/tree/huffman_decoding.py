def decodeHuff(root, s):
        # Enter Your Code Here
    ptr = root
    st = ""

    for c in s:
        if c == "0":
            ptr = ptr.left
        elif c == "1":
            ptr = ptr.right

        if ptr.data is not None:
            st += ptr.data
            ptr = root

    print(st)

def merge_the_tools(string, k):
    # your code goes here
    blocks = []
    i = 0

    while i < len(string):
        s = string[i:i+k]
        blocks.append(s)
        i += k

    for b in blocks:
        l = set()
        s = ""
        for c in b:
            if c not in l:
                s += c
                l.add(c)
        print(s)

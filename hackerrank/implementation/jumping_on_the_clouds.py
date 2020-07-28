def jumpingOnClouds(c):
    jumps = 0
    j = 0
    while j < len(c) - 2:
        if c[j + 2] == 0:
            j += 2
        elif c[j + 1] == 0:
            j += 1

        jumps += 1

    if j != len(c) - 1:
        jumps += 1
    return jumps

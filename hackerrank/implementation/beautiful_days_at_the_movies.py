def beautifulDays(i, j, k):
    num = 0
    for a in range(i, j+1):
        a_s = str(a)[::-1]
        b = int(a_s)

        if ((a-b)/k) % 1 == 0:
            num += 1
    return num

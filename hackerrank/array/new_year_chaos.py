def minimumBribes(q):
    bribes = 0

    for i, n in enumerate(q):
        if n - i - 1 > 2:
            return "Too chaotic"
        elif n - i - 1 < 0:
            continue
        elif n - i - 1 <= 2:
            bribes += abs(n-i-1)
    return bribes


# 1 2 5 3 7 8 6 4 -> 7
q = [1, 2, 5, 3, 7, 8, 6, 4]

print(minimumBribes(q))

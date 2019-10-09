# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY a
#  2. INTEGER_ARRAY b
#


def getTotalX(a, b):
    # Write your code here
    total = 0
    for i in range(max(a), min(b)+1):
        good = True
        for f in a:
            if i % f != 0:
                good = False
                break
        if not good:
            continue
        else:
            good = True
            for f in b:
                if f % i != 0:
                    good = False
                    break

            if good:
                total += 1

    return total

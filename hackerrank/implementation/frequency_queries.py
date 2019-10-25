from collections import defaultdict


def freqQuery(queries):
    m = defaultdict(int)
    freq = defaultdict(int)
    arr = []
    for q in queries:
        if q[0] == 1:
            freq[m[q[1]]] -= 1
            m[q[1]] += 1
            freq[m[q[1]]] += 1

        elif q[0] == 2:
            if m[q[1]] <= 0:
                continue
            else:
                freq[m[q[1]]] -= 1
                m[q[1]] -= 1
                freq[m[q[1]]] += 1
        elif q[0] == 3:
            if freq[q[1]] > 0:
                arr.append(1)
            else:
                arr.append(0)

    return arr

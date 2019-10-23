def repeatedString(s, n):
    a_s = 0
    a_n = 0
    if len(s) > n:
        for i in range(n):
            if s[i] == "a":
                a_s += 1
        return a_s
    else:
        for c in s:
            if c == "a":
                a_s += 1
        a_n = int(n/len(s)) * a_s
        rem = n % len(s)

        for i in range(rem):
            if s[i] == "a":
                a_n += 1
        return a_n


n = 10
s = "aba"

print(repeatedString(s, n))

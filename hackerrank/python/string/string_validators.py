if __name__ == '__main__':
    s = input()

    bools = [False] * 5

    for c in s:
        if c.isalnum():
            bools[0] = True
        if c.isalpha():
            bools[1] = True
        if c.isdigit():
            bools[2] = True
        if c.islower():
            bools[3] = True
        if c.isupper():
            bools[4] = True

    for e in bools:
        print(e)

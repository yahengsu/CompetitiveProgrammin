def minion_game(string):
    # your code goes here
    st = 0
    kv = 0
    vowels = 'AEIOU'
    for i in range(0, len(string)):
        c = string[i]
        if c in vowels:
            kv += len(string) - i
        else:
            st += len(string) - i

    if st > kv:
        print("Stuart {score}".format(score=st))
    elif kv > st:
        print("Kevin {score}".format(score=kv))
    else:
        print("Draw")

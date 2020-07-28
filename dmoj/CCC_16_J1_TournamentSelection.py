import sys

data = sys.stdin.read().split('\n')
wins = 0
for m in data:
    if m == "W":
        wins += 1

if wins > 4:
    print("1")
elif wins > 2:
    print("2")
elif wins > 0:
    print("3")
else:
    print("-1")

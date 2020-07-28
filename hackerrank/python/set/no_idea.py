# Enter your code here. Read input from STDIN. Print output to STDOUT
line = map(int, input().split(" "))
arr = map(int, input().split(" "))
a = set(map(int, input().split(" ")))
b = set(map(int, input().split(" ")))

happiness = 0

for e in arr:
    if e in a:
        happiness += 1
    elif e in b:
        happiness -= 1

print(happiness)

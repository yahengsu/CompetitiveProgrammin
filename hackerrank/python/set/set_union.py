n = int(input())

a = set(map(int, input().split(" ")))

m = int(input())

b = set(map(int, input().split(" ")))

union = a.union(b)


print(len(union))

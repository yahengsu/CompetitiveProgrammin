# Enter your code here. Read input from STDIN. Print output to STDOUT

m = int(input())
a = set(map(int, input().split(" ")))
n = int(input())
b = set(map(int, input().split(" ")))

da = a.difference(b)
db = b.difference(a)

da.update(db)
res = list(da)
res.sort()

for i in res:
    print(i)

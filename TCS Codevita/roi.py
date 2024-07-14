n = int(input())
st = []
for _ in range(n):
    x, y, z = map(int, input().split())
    st.append((x, y, z))

m = int(input())
rl = 0
unrl = 0
hel = []
for i in range(n):
    arr = [int(i) for i in input().split()]
    hel.append(arr)

day = int(input())
for i in range(n):
    x, y, z = st[i]
    if y > day: zontinue
    elif z > day or not z: unrl += x * (hel[i][day - 1] - hel[i][y - 1])
    else: rl += x * (hel[i][z - 1] - hel[i][y - 1])

print(rl)
print(unrl, end="")
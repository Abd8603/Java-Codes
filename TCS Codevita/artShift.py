from sys import maxsize

def mnSp(srt, l, r, counting, minm):
    if l == r:
        if solve(srt):
            return counting
        else:
            return maxsize
    for i in range(l + 1, r + 1, 1):
        srt[i], srt[l] = srt[l], srt[i]
        counting += 1
        x = mnSp(srt, l + 1, r, counting, minm)
        srt[i], srt[l] = srt[l], srt[i]
        counting -= 1
        y = mnSp(srt, l + 1, r, counting, minm)
        minm = min(minm, min(x, y))
    return minm

def solve(srt):
    n = len(srt)
    st = set()
    st.add(srt[0])
    for i in range(1, n):
        if srt[i] == srt[i - 1]:
            continue
        if srt[i] in st:
            return False
        st.add(srt[i])
    return True


n = int(input())
lsta = []
for i in input().split():
    lsta.append(i)
result = mnSp(lsta, 0, n - 1, 0, maxsize)
print(result)

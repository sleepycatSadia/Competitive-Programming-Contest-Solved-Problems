a = input().split(" ")
b = input().split()
sum1 = 0
sum2 = 0

for x in range(7):
    sum1 += int(a[x])
    sum2 += int(b[x])

if(sum1 > sum2):
    print("umair wins the buffet")
else:
    print("zuaina wins the buffet")
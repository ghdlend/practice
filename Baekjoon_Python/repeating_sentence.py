#N단을 입력받아 N단의 구구단을 출력
i = int(input("단을 입력하시오 : "))
print(i,"단")

for j in range(1,9):
    print(f"{i} * {j} = {i*j}")
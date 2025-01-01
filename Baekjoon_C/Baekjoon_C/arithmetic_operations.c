#include<stdio.h>
int main(void) {
	int i, j;
	printf("입력받을 두 정수를 입력하시오 : ");
	scanf_s("%d %d", &i, &j);
	printf("\n두 수의 값은 : %d %d\n", i, j);
	printf("두 수의 합은 : %d\n",i + j);
	printf("두 수의 차는 : %d\n",i - j);
	printf("두 수의 곱은 : %d\n",i * j);
	printf("두 수의 나눈 값은 : %d", i / j);
}
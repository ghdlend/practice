#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main(void) {
	//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오
	int i, j;
	printf("단을 입력하시오 : ");
	scanf("%d", &i);

	for (j = 1; j <= 9; j++) {
		printf("%d * %d = %d\n", i, j, i * j);
	}
		
}
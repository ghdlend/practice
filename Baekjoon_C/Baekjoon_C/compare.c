#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main(void) {
	//예로, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 
	//점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
	//점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
	//단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
	/*int x, y;
	printf("좌표 입력\n");
	scanf("%d %d", &x, &y);

	if (x == 0 || y == 0)
		return 1;
	else if (x > 0 && y > 0)
		printf("1사분면\n");
	else if (x < 0 && y > 0)
		printf("2사분면\n");
	else if (x > 0 && y < 0)
		printf("3사분면\n");
	else
		printf("4사분면\n");

	return 0;*/



	//연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
    //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
	/*int year;
	printf("연도를 입력하세요 : ");
	scanf("%d", &year);

	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		printf("1");
	else
		printf("0");*/


	//시험 점수를 입력받아 90 ~100점은 A, 80 ~89점은 B,
	//70 ~79점은 C, 60 ~69점은 D, 나머지 점수는 F를 출력하는 프로그램
	/*int score;
	printf("점수를 입력하시오 : ");
	scanf("%d", &score);

	if (score >= 90 && score <= 100)
		printf("A");
	else if (score >= 80 && score <= 89)
		printf("B");
	else if (score >= 70 && score <= 79)
		printf("C");
	else if (score >= 60 && score <= 69)
		printf("D");
	else
		printf("F");
	return 0;*/


	//두 수 비교하기
	//값이 큰 쪽으로 부등호 
	/*int i,j;
	printf("값을 입력하시오 : ");
	scanf("%d %d", &i, &j);

	if (i == j)
		printf("==");
	else if (i < j)
		printf("<");
	else
		printf(">");*/
}
#include<stdio.h>
int main(void) {
	int i, j;
	printf("�Է¹��� �� ������ �Է��Ͻÿ� : ");
	scanf_s("%d %d", &i, &j);
	printf("\n�� ���� ���� : %d %d\n", i, j);
	printf("�� ���� ���� : %d\n",i + j);
	printf("�� ���� ���� : %d\n",i - j);
	printf("�� ���� ���� : %d\n",i * j);
	printf("�� ���� ���� ���� : %d", i / j);
}
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main(void) {
	//N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
	int i, j;
	printf("���� �Է��Ͻÿ� : ");
	scanf("%d", &i);

	for (j = 1; j <= 9; j++) {
		printf("%d * %d = %d\n", i, j, i * j);
	}
		
}
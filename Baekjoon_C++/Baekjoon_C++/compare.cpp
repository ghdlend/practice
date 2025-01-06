#include<iostream>
//int main(void) {
	//예로, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 
	//점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
	//점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
	//단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
	/*int x, y;
	std::cout << "x,y좌표 입력 : ";
	std::cin >> x >> y;
	if (x > 0 && y > 0)
		std::cout << "1사분면" << std::endl;
	if (x < 0 && y > 0)
		std::cout << "2사분면" << std::endl;
	else if (x < 0 && y < 0)
		std::cout << "3사분면" << std::endl;
	else if (x > 0 && y < 0)
		std::cout << "4사분면" << std::endl;
	else
		std::cout << "값을 잘 못 입력하였습니다." << std::endl;*/


	//연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
    //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
	/*int year;
	std::cout << "연도를 입력하시오 : ";
	std::cin >> year;
	if ((year % 4 == 0 && year % 100 != 0) || year % 400)
		printf("윤년");    //c++에서 std::cout<<"Hello";와 printf("Hello")의 차이점
	else				   //printf를 사용하면 타입을 지정해줘야 함
		printf("1");*/	   //예를 들어 정수형이면 %d 같은 경우



	//시험 점수를 입력받아 90 ~100점은 A, 80 ~89점은 B,
	//70 ~79점은 C, 60 ~69점은 D, 나머지 점수는 F를 출력하는 프로그램
	/*int score;
	std::cout << "점수를 입력하시오 : ";
	std::cin >> score;
	if (score <= 100 && score >= 90)
		std::cout << "A" << std::endl;
	else if (score <= 89 && score >= 80)
		std::cout << "B" << std::endl;
	else if (score <= 79 && score >= 70)
		std::cout << "C" << std::endl;
	else if (score <= 69 && score >= 60)
		std::cout << "D" << std::endl;
	else
		std::cout << "F" << std::endl;
	return 0;*/


	//두 수를 비교해서 값은 큰 쪽으로 부등호 표시
	/*int i, j;
	std::cout << "두 개의 정수를 입력 : ";
	std::cin >> i >> j;
	if (i < j)
		std::cout << "<" << std::endl;
	else if (i > j)
		std::cout << ">" << std::endl;
	else
		std::cout << "값이 같습니다." << std::endl;
	return 0;*/
//}
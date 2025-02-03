#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define LEN_INPUT 10

int main(void) {
    char s1[LEN_INPUT];
    scanf("%c", &s1);

    if (s1 >= 'A' && s1 <= 'Z') {
        printf("%c", s1 + 32);
    }
    else if (s1 >= 'a' && s1 <= 'z') {
        printf("%c", s1 - 32);
    }
    else {
        printf("%c is not alphabet");
    }
    return 0;
}

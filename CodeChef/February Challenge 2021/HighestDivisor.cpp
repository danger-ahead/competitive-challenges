#include <stdio.h>
using namespace std;

int main(){
    int input, max, i = 1;
    scanf("%d",&input);
    for (i = 1; i <= 10; i++)
        if(input % i == 0)
            max = i;
    printf("%d", max);
    return 0;
}

//https://www.codechef.com/FEB21C/problems/HDIVISR
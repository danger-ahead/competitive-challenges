#include <stdio.h>
using namespace std;

int main() {
	// your code goes here
    float x,y;
    scanf("%f %f",&x,&y);
    if((int)x % 5 == 0 && x + 0.5 <= y){
        y=y-x-0.50;
        printf("%.2f",y);
    }
    else{
        printf("%.2f",y);
    }
	return 0;
}

#include <stdio.h>
using namespace std;

int main() {
	int x, y, T, max;
    scanf("%d",&T);
    for(int i = 0; i < T; i++){
        x = 0;
        y = 0;
        scanf("%d %d",&x, &y);
        max = x + y;
        if (x > y)
            printf("%d %d\n",x, max);
        else
            printf("%d %d\n",y, max);
    }
	return 0;
}
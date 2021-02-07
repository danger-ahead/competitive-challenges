#include <stdio.h>
using namespace std;

int main() {
	int T, N, sum;
    scanf("%d",&T);
    for(int i = 0; i < T; i++){
        scanf("%d",&N);
        sum = 0;
        while (N > 0){
            sum = sum + N % 10;
            N = N / 10;
        }
        printf("%d\n",sum);
    }
	return 0;
}

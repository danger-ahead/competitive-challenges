#include <stdio.h>
using namespace std;

int main() {
	int T, N, reverse;
    scanf("%d",&T);
    for(int i = 0; i < T; i++){
        scanf("%d",&N);
        reverse = 0;
        while (N > 0){
            reverse = reverse * 10 + N % 10;
            N = N / 10;
        }
        printf("%d\n",reverse);
    }
	return 0;
}

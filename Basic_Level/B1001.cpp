
#include <cstdio>
int main(void){
    int n, step = 0;
    scanf("%d",&n);
    while(n != 1){
        if(n % 2 == 0)n /= 2;
        else if(n % 2 == 1)n = (n * 3 + 1) / 2;
        step++;
    }
    printf("%d",step);
    return 0;
}

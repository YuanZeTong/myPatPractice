#include <stdio.h>
int main(){
    int N, M;
    scanf("%d%d", &N, &M);
    int a[N];
    for(int i = 0; i < N; i++){
        scanf("%d", &a[i]);
    }
    M = M % N;
    int count = 0;
    for(int i = N - M; i < N; i++){
        printf("%d", a[i]);
        count++;
        if(count < N)
            printf(" ");
    }
    for(int i = 0; i < N - M; i++){
        printf("%d", a[i]);
        count++;
        if(count < N)
            printf(" ");
    }
    return 0;
}

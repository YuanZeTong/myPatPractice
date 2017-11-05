#include <stdio.h>
int main(){
    int n, a1, a2, b1, b2;
    int failedA = 0, failedB = 0;
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d%d%d%d", &a1, &a2, &b1, &b2);
        if(a1 + b1 == a2 && a1 + b1 != b2)
            failedB++;
        else if(a1 + b1 != a2 && a1 + b1 == b2)
            failedA++;
        else
            continue;
    }
    printf("%d %d\n", failedA, failedB);
    return 0;

}

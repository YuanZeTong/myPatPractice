#include <cstdio>
int main(void){
    long long A, Da, B, Db, Pa = 0, Pb = 0;
    scanf("%lld%lld%lld%lld", &A, &Da, &B, &Db );
    while(A != 0){
        if(A % 10 == Da)
            Pa = Pa * 10 + Da;
        A = A / 10;
    }
    while(B != 0){
        if(B % 10 == Db)
            Pb = Pb * 10 + Db;
        B = B / 10;
    }
    printf("%lld\n",Pa + Pb);
    return 0;
}

#include <stdio.h>
typedef long long LL;
int main(){
    int T, num;
    scanf("%d",&T);
    num = T;
    while(T--){
    LL a, b, c;
    scanf("%lld%lld%lld",&a,&b,&c);
    if(a + b > c) printf("Case #%d: true\n",num - T);
    else printf("Case #%d: false\n",num - T);
    }
    return 0;
}

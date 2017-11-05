#include<stdio.h>
const int LCK_TCK = 100;
int main(){
    int c1,c2;
    int seconds;
	scanf("%d%d", &c1, &c2);
	int ans = c2 - c1;
	if(ans % 100 >= 50)
        ans = ans / 100 + 1;
    else
        ans /= 100;
    seconds = ans;
	int nowSeconds = seconds % 60;

	int nowMinutes = seconds % 3600 /60;

	int nowHours = seconds / 3600;
	printf("%02d:%02d:%02d", nowHours, nowMinutes, nowSeconds);
	return 0;
}

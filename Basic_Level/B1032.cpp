#include <stdio.h>
int main(){
    int N;
    scanf("%d", &N);
    int scores[N] = {0};
    int maxScore = 0, indexOfMax = 0;
    for(int i = 0; i < N; i++){
        int index, score;
        scanf("%d%d", &index, &score);
        scores[index] += score;
        if(scores[index] > maxScore){
            maxScore = scores[index];
            indexOfMax = index;
        }
    }
    printf("%d %d", indexOfMax, maxScore);
    return 0;
}

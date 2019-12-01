#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    freopen("input.txt", "r", stdin);
    setbuf(stdout, NULL);

    int test, num, *score;
    int i, j;

    scanf("%d", &test);

    for(i=0; i<test; i++)
    {
        int winner = 0, average = 0;
        float result;
        scanf("%d", &num);

        score = (int*)malloc(sizeof(int*)*num);
        memset(score, 0, sizeof(int*)*num);

        for(j=0; j<num; j++)
        {
            scanf("%d", &score[j]);
            average += score[j];
        }

        average = average / num;
        for(j=0; j<num; j++)
        {
            if(score[j] > average)
                winner++;
        }

        result = ((float)(100*winner)/(num));
        printf("%.3lf%%\n", result);
    }

    return 0;
}

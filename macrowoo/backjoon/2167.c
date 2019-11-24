#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int getResult(int *range, int *array, int max)
{
    int sum=0, i, j;

    for(i=range[0]-1; i<=range[2]-1; i++)
    {
        for(j=range[1]-1; j<=range[3]-1; j++)
            sum += *(array+(max*i)+j);
    }

    return sum;
}

int main()
{
    //freopen("input.txt", "r", stdin);
    //setbuf(stdout, NULL);

    int col, row, num, sum[4], *matrix;
    int i, j;

    // 첫번쨰 라인의 값 입력
    scanf("%d", &col);
    scanf("%d", &row);

    matrix = (int*)malloc(sizeof(int*)*col*row);
    memset(matrix, 0, sizeof(int*)*col*row);

    // 배열의 원소값 입력
    for(i=0; i<col; i++)
    {
        for(j=0; j<row; j++)
            scanf("%d", &matrix[i*row+j]);
    }

    // 계산 횟수 입력
    scanf("%d", &num);

    // 계산 범위 입력 후 값 출력
    for(i=0; i<num; i++)
    {
        for(j=0; j<4; j++)
            scanf("%d", &sum[j]);

        printf("%d\n", getResult(&sum[0], matrix, row));
    }


    return 0;
}

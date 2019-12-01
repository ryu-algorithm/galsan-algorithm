#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define DEBUG 0

int key, range_x, range_y;

int gimzang(int *field, int x, int y)
{
    if(x < 0 || y < 0 || x >= range_x || y >= range_y)
        return -1;

    // Check current flag
    if(field[y*range_x+x] == 0)
    {
        field[y*range_x+x] = key;
    }
    else if(field[y*range_x+x] > 0)
    {
        return 1;
    }
    else
    {
        field[y*range_x+x] = -2;
        return 1;
    }

    // Recursive Checking Location
    if(x > 0 && field[y*range_x+x-1] == 0)
        gimzang(field, x-1, y); //Left

    if(y > 0 && field[(y-1)*range_x+x] == 0)
        gimzang(field, x, y-1); //Right

    if(x+1 < range_x && field[y*range_x+x+1] == 0)
        gimzang(field, x+1, y); //Up

    if(y+1 < range_y && field[(y+1)*range_x+x] == 0)
        gimzang(field, x, y+1); //Down

    return 0;
}

int main()
{
#if DEBUG
    freopen("input.txt", "r", stdin);
    setbuf(stdout, NULL);
#endif // DEBUG

    int testcase, col, row, num;
    int i, j;

    scanf("%d", &testcase);

    for(i=0; i<testcase; i++)
    {
        int *field, n;
        scanf("%d", &row);
        scanf("%d", &col);
        scanf("%d", &num);

        // Initialize each Global Value
        field = (int*)malloc(sizeof(int*)*col*row);
        memset(field, -1, sizeof(int*)*col*row);
        key = 1;
        range_x = row;
        range_y = col;

        // To get Available field
        for(j=0; j<num; j++)
        {
            int x,y;
            scanf("%d", &x);
            scanf("%d", &y);

            field[range_x*y+x] = 0;
        }

#if DEBUG
        printf("============================================\n");
        int l,k;
        for(l=0; l<range_y; l++)
        {
            for(k=0; k<range_x; k++)
            {
                printf("%3d", field[range_x*l+k]);
            }
            printf("\n");
        }
        printf("============================================\n");
#endif // DEBUG

        // Loop to get result
        n = range_x*range_y;
        while(--n >= 0)
        {
            if(!gimzang(field, n%range_x, n/range_x))
                key++;
        }
        printf("%d\n", key-1);

#if DEBUG
        printf("============================================\n");
        for(l=0; l<range_y; l++)
        {
            for(k=0; k<range_x; k++)
            {
                printf("%3d", field[range_x*l+k]);
            }
            printf("\n");
        }
        printf("============================================\n");
#endif // DEBUG
    }

    return 0;
}

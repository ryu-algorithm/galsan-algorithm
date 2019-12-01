#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main()
{
    int min, max, cur;
    int stc, flag = 1, check;

    scanf("%d", &min);
    scanf("%d", &max);

    cur = min;
    while(cur <= max)
    {
        stc = sqrt((double)cur);
        check = 2;

        // loop to check sosu
        while(check <= stc)
        {
            if(cur % check == 0)
            {
                flag = 0;
                break;
            }
            else
            {
                if(check%2 == 0)
                    check += 1;
                else
                    check += 2;
            }
        }

        // Get Output
        if(flag && cur > 1)
            printf("%d\n", cur);

        // Get Next point
        if(cur < 2)
        {
            cur = 2;
        }
        else
        {
            if(cur%2 == 0)
                cur += 1;
            else
                cur += 2;
        }

        flag = 1;
    }

    return 0;
}

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define DEBUG 1
char segment[10] = {6,2,5,5,4,5,6,3,7,5};
int err_no;
void reverse_string(char *array)
{
    int start = 0, end, i=0;
    char dat;

    while(i<15)
    {
        if(array[i] == 0)
            break;
        i++;
    }
    end = i-1;

    while(1)
    {
        if(start >= end)
            return;

        dat = array[start];
        array[start] = array[end];
        array[end] = dat;

        start++;
        end--;
    }
}

int getsum(char *array)
{
    int i=0, sum = 0;
    while(array[i] != 0)
    {
        sum += segment[array[i]-48];
        i++;
    }

    return sum;
}

void add_time(char *array)
{
    int i;

    for(i=0; i<15; i++)
    {
        if(array[i] == 0)
            array[i] = 49;
        else
            array[i]++;

        if(array[i] >= 58)
            array[i] = 48;
        else
            break;
    }
}

int check_array(char *array)
{
    int i=0, j, end, check = 0, ret = 0, num = 0;

    while(i<15)
    {
        if(array[i] == 0)
            break;
        i++;
    }
    end = i;

    if(end <= 6)
        return 0;

    if(array[0] == 56)
    {
        check = 1;
        ret = 2;
    }
    else if(array[0] == 54)
    {
        check = 2;
    }
    else if(array[0] == 49)
    {
        check = -1;
    }
    else
        return 0;

    if(check)
    {
        int checksum = 0;
        for(i=1; i<end-1; i++)
        {
            if((check == 1 || check == 2) && array[i] == 56)
            {
                num++;
            }
            else if(check == -1 && array[i] == 49)
            {
                num++;
            }
            else
            {
                if(check == -1 && array[i] == 55 && i+1 < 15 && array[i+1])
                {
                    check = 3;
                    i++;
                }

                checksum = 1;
                break;
            }
        }

        if(!checksum)
            i--;

        if(num >= 5)
        {
            err_no = array[i] - 48;

            if(check == 1)
                err_no += 10;
            else if(check == 2)
                err_no += 20;
            else if(check == 3)
                err_no += 30;

            return i;
        }
        else
            return 0;
    }

    return 0;
}

double exception_calculation(int num)
{
    switch(err_no)
    {
    case 0:
    break;
    case 0:
    break;
    case 0:
    break;
    case 0:
    break;
    case 0:
    break;
    case 0:
    break;
    case 0:
    break;
    case 0:
    break;
    case 0:
    break;
    case 0:
    break;
    }
}

int main()
{
#ifdef DEBUG
    while(1)
#endif
    {
        char screen[15] = {-1,};
        int goal, num = 0, *err_no;
        double timer = 0;

        scanf("%s", &screen[0]);

        reverse_string(&screen[0]);
        goal = getsum(&screen[0]);

/*        if(num = check_array(&screen[0], err_no))
        {
            timer = exception_calculation(num);
        }
        else*/
        {
            while(1)
            {
                add_time(&screen[0]);
                timer++;

                if(goal == getsum(&screen[0]))
                    break;
            }
        }
        printf("%.0lf\n", timer);
    }
    return 0;
}

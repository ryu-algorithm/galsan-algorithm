#include <stdio.h>
#include <stdlib.h>

int main()
{
    int range, num;
    int i, goal, check = 0, output = 0;
    int cur = 0, left, right, queue[50] = {0,};

    scanf("%d", &range);

    // Create queue array
    for(i=0; i<range; i++)
        queue[i] = i+1;

    scanf("%d", &num);

    for(i=0; i<num; i++)
    {
        scanf("%d", &goal);
        left = right = cur;

        while(1)
        {
            // Succeed to find goal
            if(queue[left] == goal || queue[right] == goal)
            {
                if(queue[left] == goal)
                    cur = left;
                else
                    cur = right;

                queue[cur] = 0;

                // Complete to find all goal
                if(++check >= num)
                    break;

                // move to right position
                while(1)
                {
                    cur++;
                    if(cur >= range)
                        cur = 0;

                    if(queue[cur])
                        break;
                }
                break;
            }
            else
            {
                // move to left position
                while(1)
                {
                    left--;
                    if(left < 0)
                        left = range-1;

                    if(queue[left])
                        break;
                }

                // move to right position
                while(1)
                {
                    right++;
                    if(right >= range)
                        right = 0;

                    if(queue[right])
                        break;
                }

                output++;
            }
        }
    }

    printf("%d\n", output);


    return 0;
}

using System;

namespace homework1463
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 0;
            int a = int.Parse((Console.ReadLine()));
            while (a > 1)
            {
                if (a % 3 == 0)
                {
                    a = a / 3;
                }
                else if (a % 3 == 1)
                {
                    a = a - 1;
                }
                else
                {
                    if ((a / 3) % 2 == 0)
                    {
                        a = a / 2;
                    }
                    else
                    {
                        a = a - 1;
                    }
                }
                i++;
            }
            Console.WriteLine(i);
        }
    }
}

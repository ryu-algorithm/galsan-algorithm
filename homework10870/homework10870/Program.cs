using System;

namespace homework10870
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 0, b = 1, c = 0;
            int n = int.Parse((Console.ReadLine()));
            if (n == 0)
            {
                Console.WriteLine(a);
            }
            else
            {
                for (int i = 1; i <= n; i++)
                {
                    c = a + b;
                    a = b;
                    b = c;
                }
                Console.WriteLine(c);
            }
        }
    }
}

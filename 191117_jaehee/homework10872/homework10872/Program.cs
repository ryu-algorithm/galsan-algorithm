using System;

namespace homework10872
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 1;
            int i = 1;
            int n = int.Parse((Console.ReadLine()));

            while(n>=i)
            {
               a = a * i;
                i++;
            }
            Console.WriteLine(a);
        }
    }
}

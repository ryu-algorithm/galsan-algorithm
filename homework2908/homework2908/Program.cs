using System;

namespace homework2908
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, b, c = 0;
            string t = Console.ReadLine();
            String[] result = t.Split(new char[]{});
            a = int.Parse(result[0]);
            b = int.Parse(result[1]);
            for (int i = 0; i < 3; i++)
            {
                int d = a % 10, e = b % 10;

                if (d == e)
                {
                    c = c + (int)(d * Math.Pow(10, 2 - i));
                }
                else
                {
                    if (d > e)
                    {
                        c = c + (int)(d * Math.Pow(10, 2 - i));
                        b = 0;
                        a = (a - d) / 10;
                    }
                    else
                    {
                        c = c + (int)(e * Math.Pow(10, 2 - i));
                        a = 0;
                        b = (b - e) / 10;
                    }
                }
            }
            Console.WriteLine(c);
        }
    }
}


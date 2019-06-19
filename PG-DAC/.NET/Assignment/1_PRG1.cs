using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            int num1, num2, option = 1;
            while (option==1)
            {
                Console.WriteLine("Enter Two numbers");
                num1 = Convert.ToInt32(Console.ReadLine());
                num2 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter \n 1.Sum \n 2.Divide \n 3.Multiply \n 4.Subract \n 5.Exit");
                switch (Console.ReadLine())
                {
                    case "1":
                        Console.WriteLine(num1 + num2);
                        break;
                    case "2":
                        Console.WriteLine(num1 / num2);
                        break;
                    case "3":
                        Console.WriteLine(num1 * num2);
                        break;
                    case "4":
                        Console.WriteLine(num1 - num2);
                        break;
                    case "5":
                        Environment.Exit(1);
                        break;
                }
                Console.WriteLine("Do you want to continue press 1");
                option = Convert.ToInt32(Console.ReadLine());
            }            
            Console.ReadKey();
        }
    }
}

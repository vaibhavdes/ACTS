using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Program
    {
        static void Main(string[] args)
        {
            Order o;

            Console.WriteLine("Enter 1 for Domestic and 2 for Overseas Order");
            int option = Convert.ToInt32(Console.ReadLine());

            if(option == 1)
                o = new Order(1, "santoor", 21, 25.62);
            else
                o = new Order_Overseas(1, "santoor", 21, 25.62);

            Console.WriteLine(o.GetOrderValue());

            Console.ReadKey();
        }
    }
}

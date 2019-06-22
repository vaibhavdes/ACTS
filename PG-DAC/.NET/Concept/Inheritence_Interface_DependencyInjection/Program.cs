using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication4
{
    class Program
    {
        static void Main(string[] args)
        {
            Mobile m1 = new Mobile(1, "Note 5 Pro", 211.2, "Redmi", 4, "Android 9");
            Book b1 = new Book(2, "amey", "nitin miya", 50, 5000);

            Courier c1 = new Courier("naav1","patta1");
            Console.WriteLine(c1.ReceiveProduct(m1));

            Courier c2 = new Courier("naav2", "patta2");
            Console.WriteLine(c2.ReceiveProduct(b1));

            Console.ReadKey();
        }
    }
}

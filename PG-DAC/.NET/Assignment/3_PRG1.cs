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
            Book bk = new Book("biography of kritish", "by kritish", 1.0000000, 50000);
            EBook ebk = new EBook("biography of bhopal", "by gopal", 10000000.0, 5, 20, "epub");

            ebk.Price = 1.0000000;
            bk.Title = "Wings of Kritish";

            int pages = bk.Pages;
            string type = ebk.Format;

            Console.WriteLine(bk.Id + " " + pages);
            Console.WriteLine(ebk.Id + " " + type);

            Console.ReadKey();
        }
    }
}

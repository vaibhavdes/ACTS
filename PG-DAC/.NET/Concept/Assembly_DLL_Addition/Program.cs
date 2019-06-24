using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication6
{
    class Program
    {
        static void Main(string[] args)
        {
            Calculator.Calculator cc = new Calculator.Calculator();
            cc.add(10,20);
            Console.ReadKey();
        }
    }
}

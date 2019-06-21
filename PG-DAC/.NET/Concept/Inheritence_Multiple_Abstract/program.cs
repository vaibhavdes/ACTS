using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication3
{
    class Program
    {
        static void Main(string[] args)
        {
            int option = 0;
            Console.WriteLine("Enter Amount to be taken, Duration (in Month) **** Rate is 12% Fixed");

            Loan l1 = new HomeLoad(1, "kritin", "nitin@kritin.com", 999999999, Convert.ToInt32(Console.ReadLine()), Convert.ToInt32(Console.ReadLine()), 12.00);
            Console.WriteLine("Total Loan Amount to be Paid: " + l1.GetPendingLoan());

            Console.WriteLine("Want to Pay EMI press 1");
            option = Convert.ToInt32(Console.ReadLine());

            int emi = 0;
            while (option == 1)
            {
                emi = Convert.ToInt32(l1.GetPendingLoan()) / l1.Duration;
                l1.PayEMI(emi);
                Console.WriteLine("Paid EMI: " + emi);
                Console.WriteLine("Want to Pay More");
                option = Convert.ToInt32(Console.ReadLine());
            }

            Console.WriteLine("Loan Paid: " + (Loan.count * emi));
            Console.WriteLine("Loan To Be Paid: " + (l1.GetPendingLoan() - (Loan.count * emi)));
             
            Console.ReadKey();
        }
    }
}

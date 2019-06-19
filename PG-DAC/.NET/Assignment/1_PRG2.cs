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
            int acctId, acctBalance, amt, option = 1;
            String custName, custAddress;
            Console.WriteLine("Enter ACCT ID, Balance, Name, Addres, each on new line");

            acctId = Convert.ToInt32(Console.ReadLine());
            acctBalance = Convert.ToInt32(Console.ReadLine());
            custName = Console.ReadLine();
            custAddress = Console.ReadLine();

            while (option==1)
            {
                Console.WriteLine("Enter \n 1.Deposit \n 2.Withdraw  \n 3.Check Bal \n 4.Exit");
                switch (Console.ReadLine())
                {
                    case "1":
                        Console.WriteLine("Enter Amount to Deposit");
                        amt = Convert.ToInt32(Console.ReadLine());
                        if (amt >= 500)
                            acctBalance += amt;
                        else
                            Console.WriteLine("Minimum Amt to Withdraw is 500");
                        break;
                    case "2":
                        Console.WriteLine("Enter Amount to Withdraw");
                        amt = Convert.ToInt32(Console.ReadLine());
                        if (amt >= 0)
                            if (amt < acctBalance)
                                acctBalance -= amt;
                            else
                                Console.WriteLine("Account Madhe Balance Tak");
                        else
                            Console.WriteLine("Swiss Bank madhe Account Ahe ka");                            
                        break;
                    case "3":
                            Console.WriteLine("Aapka Account Balance hai keval " + acctBalance + " Rupayee");
                        break;
                    case "4":
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

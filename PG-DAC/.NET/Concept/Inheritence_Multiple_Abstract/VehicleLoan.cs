using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication3
{
    class VehicleLoan : Loan
    {
        public VehicleLoan(int id, string name, string email, int mobile, double amount, int duration, double rate)
            :base(id,name,email,mobile,amount,duration,rate)
        {
            Console.WriteLine("Inside Constructor");
        }

        public override double PayEMI(int Amount)
        {
            count++;
            pending = pending - Convert.ToDouble(Amount);
            return pending;
        }
    }
}

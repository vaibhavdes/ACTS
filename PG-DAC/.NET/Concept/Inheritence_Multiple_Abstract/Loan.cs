using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication3
{
    abstract class Loan
    {
        private int id;
        private string name;
        private string email;
        private int mobile;
        protected double amount;
        private int duration;
        protected double rate;

        public static double loan = 0;
        public static double pending = 0;
        public  static int count = 0;

        public int Duration
        {
            get
            {
                return duration;
            }

            set
            {
                duration = value;
            }
        }

        public Loan(int id, string name, string email, int mobile, double amount, int duration, double rate)
        {
            this.id = id;
            this.name = name;
            this.email = email;
            this.mobile = mobile;
            this.amount = amount;       //Loan Amount
            this.Duration = duration;   //Duration 
            this.rate = rate;           //Rate
        }

        abstract public double PayEMI(int Amount);

        public double GetPendingLoan()
        {
            //duration in months
            loan = (((rate * Duration * amount) / (12 * 100)) + amount);
            pending = loan;
            return loan;
        }

    }
}

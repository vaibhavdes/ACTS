using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Order_Overseas : Order
    {
        public Order_Overseas(int id, string name, int quantity, double price) : base(id, name, quantity, price)
        {

        }
        public override double GetOrderValue()
        {
            double fprice =  price * Convert.ToDouble(quantity) ;
            return fprice + (fprice * 10) / 100;
        }
    }
} 

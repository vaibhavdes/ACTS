using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
  
    public class Order
    {
        private static int id = 0;
        private string name;
        private string item;
        private int price;
        private int quantity;

        public Order(string name,string item,int price, int quantity)
        {
           id++;
            this.name = name;
            this.item = item;
            this.price = price;
            this.quantity = quantity;         
        }

        public int getOrderAmount(int GST)
        {
            return price * quantity * ((GST*price)/100);
        }

        public int POrderID
        {
            get
            {
                return id;
            }
        }

        public string PCustomerName
        {
            get
            {
                return name;
            }
            set
            {
                this.name = value;
            }
        }

        public string PItemName
        {
            get
            {
                return item;
            }
            set
            {
                this.item = value;
            }
        }

        public int PItemPrice
        {
            get
            {
                return price;
            }
            set
            {
                this.price = value;
            }
        }

        public int PItemQuantity
        {
            get
            {
                return quantity;
            }
            set
            {
                this.quantity = value;
            }
        }
    }

    class Program
    {
        static void Main(string[] args) 
        {
            Order obj = new Order("amey", "santoor", 20, 12);
            Console.WriteLine("O ID " + obj.POrderID);
            Console.WriteLine("C Name " + obj.PCustomerName);
            Console.WriteLine("I Name " + obj.PItemName);
            Console.WriteLine("I Price " + obj.PItemPrice);
            Console.WriteLine("I QUant " + obj.PItemQuantity);
            Console.WriteLine("Order Price " + obj.getOrderAmount(18));


            Console.WriteLine("Enter New Quantity");
            obj.PItemQuantity = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Order Price " + obj.getOrderAmount(18));
            Console.ReadKey();
            Environment.Exit(1);
        }
    }
}

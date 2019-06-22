using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication4
{
    class Mobile : ICourierProduct
    {
        private int id;
        private string name;
        private double price;
        private string company;
        private int ram;
        private string os;

        public Mobile(int id, string name, double price, string company, int ram, string os)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.company = company;
            this.ram = ram;
            this.os = os;
        }

        public void Start() { }
    
       public void Stop() {  }

        public void Call() { }

        public void SendMsg() { }

        public string GetFromAddress()
        {
            throw new NotImplementedException();
        }

        public string GetToAddress()
        {
            throw new NotImplementedException();
        }

        public string GetProductType()
        {
            return "Mobile";
        }
    }
}

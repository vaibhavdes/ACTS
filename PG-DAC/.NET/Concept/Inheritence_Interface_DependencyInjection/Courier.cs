using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication4
{
    class Courier : ICourierProduct
    {
        private string couriername;
        private string courieraddress;

        public Courier(string couriername, string courieraddress)
        {
            this.couriername = couriername;
            this.courieraddress = courieraddress;
        }

        public string ReceiveProduct(ICourierProduct courier)
        {
           return courier.GetProductType();
        }

        public string GetFromAddress()
        {
            return courieraddress + " " + couriername;
        }

        public string GetToAddress()
        {
            return courieraddress + " " + couriername;
        }

        public string GetProductType()
        {
            return "Product Type";
        }
    }
}

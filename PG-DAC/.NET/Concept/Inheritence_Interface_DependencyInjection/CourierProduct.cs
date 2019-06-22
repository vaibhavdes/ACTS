using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication4
{
    interface ICourierProduct
    {
        string GetFromAddress();
        string GetToAddress();
        string GetProductType();

    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication4
{
    class Book : ICourierProduct
    {
        private int id;
        private string authorName;
        private string title;
        private double price;
        private int pages;

        public Book(int id, string authorName, string title, double price, int pages)
        {
            this.id = id;
            this.authorName = authorName;
            this.title = title;
            this.price = price;
            this.pages = pages;
        }

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
            return "Book";
        }
    }
}

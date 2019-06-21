using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    
    class Book
    {
        private static int count = 0;
        private int id;
        private string title;
        private string author;
        private double price;
        private int pages;

        public Book(string title,string author,double price,int pages)
        {
            count++;
            this.id = count;
            this.title = title;
            this.author = author;
            this.price = price;
            this.pages = pages;
        }

        public int Id
        {
            get
            {
                return id;
            }

            set
            {
                id = value;
            }
        }

        public string Title
        {
            get
            {
                return title;
            }

            set
            {
                title = value;
            }
        }

        public string Author
        {
            get
            {
                return author;
            }

            set
            {
                author = value;
            }
        }

        public double Price
        {
            get
            {
                return price;
            }

            set
            {
                price = value;
            }
        }

        public int Pages
        {
            get
            {
                return pages;
            }

            set
            {
                pages = value;
            }
        }
    }

    class EBook :  Book
    {
        private int size;
        private string format;

        public EBook(string title, string author, double price, int pages,int size,string format) : base(title, author, price, pages)
        { 
            this.size = size;
            this.format = format;
        }

        public int Size
        {
            get
            {
                return size;
            }

            set
            {
                size = value;
            }
        }

        public string Format
        {
            get
            {
                return format;
            }

            set
            {
                format = value;
            }
        }
    }
    
    class Program
    {
        static void Main(string[] args)
        {
            Book bk = new Book("biography of kritish", "by kritish", 1.0000000, 50000);
            EBook ebk = new EBook("biography of bhopal", "by gopal", 10000000.0, 5, 20, "epub");

            ebk.Price = 1.0000000;
            bk.Title = "Wings of Kritish";

            int pages = bk.Pages;
            string type = ebk.Format;

            Console.WriteLine(bk.Id + " " + pages);
            Console.WriteLine(ebk.Id + " " + type);

            Console.ReadKey();
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    public class Student
    {
        int id;
        string name;
        DateTime dob;
        string city;

        public Student(int id,string name,string dob,string city)
        {
            this.id = id;
            this.name = name;
            DateTime.TryParse(dob, out this.dob);
            this.city = city;
        }

        public string getDetails()
        {
            return this.id + " " + this.name + " " + this.dob + " " + this.city;
        }

        public int getAge()
        {
            return DateTime.Compare(this.dob, DateTime.Today);
        }
    }

    class Employee
    {
        int id;
        string name;
        double salary;
        DateTime doj;

        public Employee(int id, string name, double salary, string doj)
        {
            this.id = id;
            this.name = name;
            this.salary = salary;
            DateTime.TryParse(doj, out this.doj);
        }

        public int getSalary(int days)
        {
            return  days * Convert.ToInt32(salary / 30);
        }

        public int getExperiance()
        {
            return DateTime.Compare(this.doj, DateTime.Today);
        }
    }

    class Product
    {
        int id;
        string name;
        double price;
        string type;

        public Product()
        {
            id = 1;
            name = "naav";
            price = 200.20;
            type = "Clothings";
        }

        public string getProduct()
        {
            return this.id + " " + this.name + " " + this.price + " " + this.type;
        }
    }

    class Book
    {
        int id;
        string name;
        double price;
        string author;

        public Book(int id,string name,double price,string author)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.author = author;
        }

        public string getDetails()
        {
            return this.id + " " + this.name + " " + this.price + " " + this.author;
            
        }
    }

    class Program
    {
        static void Main(string[] args) 
        {

            Student obj = new Student(1,"sdsd","2/23/2016","pune");
            Console.WriteLine("Details " + obj.getDetails());
            Console.WriteLine("Age " + obj.getAge());

            Employee obj1 = new Employee(1, "abc", 1200.5, "12/20/2018");
            Console.WriteLine("Salary " + obj1.getSalary(42));
            Console.WriteLine("Experiance " + obj1.getExperiance());

            Product obj2 = new Product();
            Console.WriteLine(obj2.getProduct());

            Book obj3 = new Book(2,"Harry Potter",200,"J K ROwling");
            Console.WriteLine(obj3.getDetails());

            Console.ReadKey();
            Environment.Exit(1);
        }
    }
}

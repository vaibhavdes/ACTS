using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
            int[] arr = { 50, 30, 22, 54 };
            int j = 0;

            for (int i = 0; i < arr.Length; i++)
                j += arr[i];

            Console.WriteLine(j);
            */

            /*
            string a1 = "abcdefg";
            char[] arr = a1.ToCharArray();
            for(int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine(arr[i]);
                i++;
            }
            */

            /*
            int[] arr1 = { 50, 30, 22, 54 };
            int[] arr2 = { 70, 80, 90, 24 };

            if (arr1.Length == arr2.Length)
                for (int i = 0; i < arr1.Length; i++)
                    arr1[i] = arr1[i] + arr2[i];

            foreach (int i in arr1)
                Console.WriteLine(i);
            */

            /*
            int[] arr1 = { 50, 30, 22, 54 };
            int[] arr2 = { 70, 30, 21, 50 };

            for (int i = 0; i < arr1.Length; i++)
                for (int j = 0; j < arr2.Length; j++)
                    if (arr1[i] == arr2[j])
                        Console.WriteLine(arr1[i] + " Present in Array 2 at position " + (i+1));
            */

            string a1 = "iqyriwpqoakfhsfghdhaklzmxbvnmxvz";
            char[] arr = a1.ToUpper().ToCharArray();

            for (int i = 65; i <= 91; i++)
                for (int j = 0; j < arr.Length; j++)
                    if (arr[j] == i)
                    {
                        Console.WriteLine(arr[j] + " Present in string");
                        break;
                    }
                 
            Console.ReadKey();
        }
    }
}

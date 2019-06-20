 /*
            int min, max;
            Console.WriteLine("Enter Min and Max Number");
            min = Convert.ToInt32(Console.ReadLine());
            max = Convert.ToInt32(Console.ReadLine());

            if (min > max)
                Console.WriteLine("Max is : " + min + " Min is : " + max);
            else
                Console.WriteLine("Max is : " + max + " Min is : " + min);
 */
 
     
        public void maxnmin()
        {
            int max = Int32.MinValue;
            int min = Int32.MaxValue;
            int[] arr = { 1, 5, 19, 2, 999, -922 };

            for (int i = 0; i < arr.Length; i++)
            {
                if (arr[i] > max)
                {
                    max = arr[i];
                }
                if (arr[i] < min)
                {
                    min = arr[i];
                }
            }
            Console.WriteLine("Min value in array is ->" + min);
            Console.WriteLine("Max value in array is ->" + max);
        }


        public void swap2numbers()
        {
            int a = 10;
            int b = 1241532542;

            Console.WriteLine("First Number is->" + a);
            Console.WriteLine("Second Number is->" + b);
            //Console.WriteLine("Pahila->" + a);
            //Console.WriteLine("Dusra->" + b);

            int temp = a;
            a = b;
            b = temp;

            Console.WriteLine("First Number after swapping is->" + a);
            Console.WriteLine("Second Number after swapping is->" + b);
            //Console.WriteLine("Pahila jhala dusra->" + a);
            //Console.WriteLine("Dusra jhala pahila->" + b);
        }

        public void OppoCase()
        {
            string mala = "Mi NighaLo Ghari, Kuni Toku Naka; Class jhala aahe Bhook lagli aahe, aata JAUDYA";
            Console.WriteLine("String is-"+mala);
            string reverse_mala = new string(mala.Select(
                c=> char.IsLetter(c) ? (char.IsUpper(c) ? char.ToLower(c) : char.ToUpper(c)) : c
                    ).ToArray());
            Console.WriteLine("New string is- " + reverse_mala);
        }



        public void swap2numbersagain()
        {
            int a = 10423323;
            int b = 1241532542;

            Console.WriteLine("First Number is->" + a);
            Console.WriteLine("Second Number is->" + b);
            //Console.WriteLine("Pahila->" + a);
            //Console.WriteLine("Dusra->" + b);

            a = a + b;
            b = a - b;
            a = a - b;

            Console.WriteLine("First Number after swapping is->" + a);
            Console.WriteLine("Second Number after swapping is->" + b);
            //Console.WriteLine("Pahila jhala dusra->" + a);
            //Console.WriteLine("Dusra jhala pahila->" + b);

        }

        public bool isItPrime(int no)
        {
            bool flag = false;
            for (int i = 2; i <= no/2; ++i)
            {
                if (no%i == 0)
                {
                    flag = true;
                    break;
                }
            }
            return flag;
        }

        public void isArrayPrime()
        {
            Int32[] arr = new Int32[10];
            Random rand = new Random();
            for (int i = 0; i < 10; i++)
            {
                arr[i] = rand.Next(1, 1000);
            }

            Console.WriteLine("The array we have is-");
            for (int i = 0; i < 10; i++)
            {
                Console.Write(arr[i] + ",");
            }
            Console.WriteLine();

            List<int> primes = new List<int>();
            for (int i = 0; i < 10; i++)
            {
                if (!isItPrime(arr[i]))
                {
                    primes.Add(arr[i]);
                }
            }
            Console.WriteLine("The prime array we have is-");
            for (int i = 0; i < primes.Count; i++)
            {
                Console.Write(primes[i] + ",");
            }
            Console.WriteLine();

        }

        public void CountWords()
        {
            string tatya = "Tula Ayushyat Durala karayacha aahe, ki Ayushyacha Dhurala karayacha aahe - Donald Tatya";
            Console.WriteLine("String is - "+tatya);
            string[] tatya_che_shabda = tatya.Split(new Char[] {' ', ',', '-', '\n', '\t' });
            int count = 0;
            foreach (var shabda in tatya_che_shabda)
            {
                if (shabda != "")
                    count++;
            }

            Console.WriteLine("No of words are "+ count);
        }

        public void CountIntegers()
        {
            string tatya = "10 la zopu aaj, 9 la uthu aaj";
            Console.WriteLine("String is - " + tatya);
            char[] ch = tatya.ToCharArray();
            int count = 0;
            for (int i = 0; i < ch.Length; i++)
            {
                if (((int)ch[i]) >= 48 && ((int)ch[i]) <= 57)
                    count++;
            }
            Console.WriteLine("Total Integers in string are " + count);
        }

        public void CountposnegNumbers()
        {
            Console.WriteLine("Kitne admi the?");
            int sx = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Numbers tak Bhaitalya");
            int[] arr = new int[sx];
            int pos = 0;
            int neg = 0;
            for (int i = 0; i < sx; i++)
            {
                arr[i] = Convert.ToInt32(Console.ReadLine());
                if (arr[i] > 0)
                {
                    pos++;
                }
                else if (arr[i] < 0)
                {
                    neg++;
                }
            }

            Console.WriteLine("Total Positive numbers"+pos);
            Console.WriteLine("Total Negative numbers"+neg);
            string sst = Console.ReadLine();

        }

        public void maxnminswap()
        {
            int[] max = new int[2]; max[0]=Int32.MinValue;
            int[] min = new int[2]; min[0]=Int32.MaxValue;
            int[] arr = { 1, 5, 19, 2, 999, -922 };

            Console.WriteLine("Array before swapping is-");
            for (int i = 0; i < arr.Length; i++)
            {
                Console.Write(arr[i] + ",");
            }
            Console.WriteLine();
            for (int i = 0; i < arr.Length; i++)
            {
                if (arr[i] > max[0])
                {
                    max[0] = arr[i];
                    max[1] = i;
                }
                if (arr[i] < min[0])
                {
                    min[0] = arr[i];
                    min[1] = i;
                }
            }
            arr[min[1]] = max[0];
            arr[max[1]] = min[0];
            Console.WriteLine("New array is-");
            for (int i = 0; i < arr.Length; i++)
            {
                Console.Write(arr[i] + ",");
            }
        }

        public void checkPalindrome()
        {
            string check = "Palindrome";
            Console.WriteLine("String to check for palindrome is- "+ check);
            char[] ori = check.ToCharArray();

            Array.Reverse(ori);

            string finalString = new string(ori);

            if (check.Equals(finalString))
            {
                Console.WriteLine("String is Palindrome");
            }
            else
            {
                Console.WriteLine("String is not Palindrome");
            }
        }
        
    

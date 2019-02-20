#include <stdio.h>
#include <stdlib.h>

#define PI 3.14 // Macro Directive or It replaces PI constant with 3.14 at compile time

//Function Declarations
int digitsum(int a); // Sum of Digits with Loop
int digit_sum(int a); // Sum of Digits with recursion
void fib(int a); //Fibonacci Series
int fact(int a); //Factorial of Number
void circle(int a); //Area of Circle
void rectangle(int a,int b); //Area of Rectangle
void square(int a); //Area of Square
int bin(int a); //Number to Binary Conversion
int sums(int a); // Sum of all number till N digits

int main(void) {

	setvbuf(stdout,NULL,_IONBF,0);

	int num,sum,i;
	{
		printf("Enter 4 Digit Number\n");
		scanf("%d",&num);

		sum = digitsum(num);
		printf("\nSum using Loop %d",sum);
		sum = digit_sum(num);
		printf("\nSum using Recursion %d",sum);

	}

	{
		printf("\nEnter Number to Know Factorial\n");
		scanf("%d",&num);
		sum = fact(num);
		printf("Factorial of a Number %d is %d \n",num,sum);

		printf("Enter Number upto which you need a Factorial Series");
		scanf("%d",&num);
		for( i = 0; i<num; i++)
		{
			sum = fact(i);
			printf("\t%d",sum);
		}
	}

	{
		printf("\n Enter Number to obtain Fibonacci Series");
		scanf("%d",&num);
		fib(num);
	}

	{
		printf("\n Enter Radius to Calculate Area of Circle");
		scanf("%d",&num);
		circle(num);

		printf("\n Enter Height & Width to Calculate Area of Rectangle");
		scanf("%d %d",&num,&sum);
		rectangle(num,sum);

		printf("\n Enter Value to Calculate Area of Square");
		scanf("%d",&num);
		square(num);
	}

	{
		printf("\nEnter Number to convert to binary\n");
		scanf("%d",&num);

		sum = bin(num);
		printf("\n Binary Representation %d \n",sum);
	}

	{
			printf("\n Enter Number to get sum\n");
			scanf("%d",&num);
			sum = sums(num);
			printf("\n Sum is %d \n",sum);
	}

	return 0;
}

//Function Definitions
int digitsum(int num)
{
    int i,a,sum = 0;
    for(i=0;i<4;i++)
    {
        a = num%10;
        num = num/10;
        sum = sum + a;
    }
    return sum;
}

int digit_sum(int num)
{
    if(num!=0)
    	return (num%10 + digit_sum(num/10));
    else
    	return 0;
}

int fact(int a)
{
	int i,sum=1;
	for(i = 1;i <= a;i++)
	{
		sum *= i; ///Shorthand for sum = sum*i;
	}
	return sum;
}

void fib(int a)
{
	static int t1=0,t2 = 1,t3=0;
	if(a!=0)
	{
		printf("\t %d",t2);
		t3 = t1 + t2;
		t1 = t2;
		t2 = t3;
		return fib(a-1);
	}
}

//Tip : Using Printf or Scanf inside function is not a good practise
void circle(int a)
{
	printf("\n %f",a*a*PI);
	//answer is in float or double
}
void rectangle(int height,int width)
{
	printf("\n %d", height*width);
}
void square(int a)
{
	printf("\n %d \n", a * a);
}

int bin(int r)
{
	if(r==0)
		return 0;
	else
		return (r%2 + 10 * bin(r/2));
}

int sums(int a)
{
	int sum = 0;
	while(a!=0)
	{
		sum = sum + a;
		a -=1;
	}
	return sum;
}

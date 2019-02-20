/*
 ============================================================================
 Name        : AssignTwo.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#define SIZE 5

void accept(int *a);
void print(int *a);

void accept_c(char *c);
void print_c(char *c);

void sort(int *a);
void swap(int *a,int *b);
void avg(int *a);
void mul2(int *a);
void info(int *a);

int main(void) {
	setvbuf(stdout,NULL,_IONBF,0);

	int array[SIZE];
	char array_c[SIZE];

	{
	//array variable name is itself an address of first element
		accept(array);
		print(array);
		sort(array);
	}

	{
		accept(array);
		avg(array);
	}

	{
		accept(array);
		mul2(array);
		print(array);
	}

	{
		//accept(array);
		sort(array);
		info(array);
	}

	{
		accept_c(array_c);
		print_c(array_c);
	}
	return 0;
}

void accept(int *array)
{
	for(int i=1;i<=SIZE;i++)
	{
		printf("Enter Element %d \n",i);
		scanf("%d",&array[i]);
	}
	printf("\n");
}

void print(int *array)
{
	for(int i=1;i<=SIZE;i++)
	{
		printf("\t%d",array[i]);
	}
	printf("\n");
}

void sort(int *array)
{
	for(int i=0;i<SIZE;i++)
	{
		for(int j=i+1;j<=SIZE;j++)
		{
			if(array[i]>array[j])
				swap(&array[i],&array[j]);
		}
	}
	printf("\n Sorted Array \n");
	//Print Sorted Array
	for(int i=0;i<SIZE;i++)
	{
		printf("\t%d",array[i]);
	}
	printf("\n");
}

void swap(int *a,int *b)
{
	//One can implement without using extra variable
	int temp = *a;
	*a = *b;
	*b = temp;
}

void avg(int *a)
{
	int sum = 0;
	for(int i=0;i<SIZE;i++)
		sum = sum + a[i];

	printf("\n Average is %d \n", sum/SIZE);
}

void mul2(int *a)
{
	int temp;
	for(int i=0;i<SIZE;i++)
	{
		temp = a[i] * 2;
		a[i] = temp;
	}
}

//There is an another method to find max,min and second max,min. This is not valid
void info(int *a)
{
	printf("Max is %d \n",a[SIZE]);
	printf("Min is %d \n",a[0]);
	printf("Second Max is %d \n",a[SIZE-1]);
	printf("Second Min is %d \n",a[1]);
	printf("\n");
}

void accept_c(char *array)
{
	for(int i=0;i<SIZE;i++)
	{
		printf("\nEnter Character %d of a word",i);
		scanf("%c",&array[i]);
		getchar();
	}
}

void print_c(char  *array)
{
	printf("\n Word is \n");
	for(int i=0;i<SIZE;i++)
		{
			printf("%c",array[i]);
		}
}

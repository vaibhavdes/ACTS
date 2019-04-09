#include<iostream>
using namespace std;

void display(int *arr,int size)
{
	int i;
	cout<<"-----------------"<<endl;
	for(i=0;i<=size-1;i++)
	{
		cout<<arr[i]<<" | "<<endl;
	}

}

void swap(int *arr,int i,int j)
{
	int temp;
	temp = arr[j];
	arr[j] = arr[i];
	arr[i] = temp;
}

void swapLoop(int *arr,int start,int end)
{
	int temp,noTemp,j;
	//temp = arr[j];
	for(j=end;j>start;j--)
	{
		noTemp=arr[j];
		arr[j] = arr[j-1];
		arr[j-1] = noTemp;
	}
}

void selectionSort(int *arr,int size)
{
	int temp,i,j,pos;
	for(i=0;i<size-1;i++)
	{
		temp = arr[i];
		for(j=i+1;j<size;j++)
		{
			//display(arr,size);
			if(arr[j]<temp)
			{
				temp = arr[j];
				pos = j;
			}			
		}	
		arr[pos]=arr[i];
		arr[i]=temp;		
	}	
}

void bubbleSort(int *arr,int size)
{
	int i,j;
	
	for(i=0;i<size-1;i++)
	{
		for(j=0;j < size-i-1;j++)
		{
			//display(arr,size);
			if(arr[j] > arr[j + 1])
			{
				swap(arr,j,j+1);
			}
		}

	} 
}

void insertionSort(int *arr,int size)
{
	int i,j,pos;
	for(i=1;i<size-1;i++)
	{
		for(j=0;j<=i;j++)
		{
			//display(arr,size);
			if(arr[j] > arr[i])
			{	
				swapLoop(arr,j,i);		//start-j and end-i
				cout<<"greater element at "<<j<<" compared with "<<i<<endl; 
			}	
			
		}

	} 
}

int main()
{

	int size,temp;
	int option;
	cout<<"Enter How Many Elements you want"<<endl;
	cin>>size;
	
	int *arr;
	arr = new int[size];

	int i;

	for(i=0;i<size;i++)
	{
		cout<<"Enter Element No "<<i+1<<endl;
		cin>>temp;
		arr[i] = temp;
	}
	
	cout<<"Press \n 1. Selection Sort \n 2. Bubble Sort \n 3. Insertion Sort"<<endl;
	cin>>option;
	
	switch(option)
	{
		case 1: 
			selectionSort(arr,size);
			display(arr,size);
			break;
		case 2: 
			bubbleSort(arr,size);
			display(arr,size);
			break;	
		case 3: 
			insertionSort(arr,size);
			display(arr,size);
			break;	
	}

	delete arr;
	
}

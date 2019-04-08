#include<iostream>
#include "array.h"
using namespace std;

stack::stack()
{
	this->arr=NULL;
	this->top=-1;
}
void stack::create(int s)
{
	this->size = s;
	this->arr = new int[s];

	cout<<"Array Initialized Succesfully"<<endl;
}
void stack::insert(int element,int position)
{
	
		this->top++;	
		this->arr[position-1]=element;		
		cout<<"Item Inserted Succesfully"<<endl;
	
}
void stack::display()
{
		
		int i;
		for(i=0;i<=(size-1);i++)
		{
			cout<<"Element at "<<i+1<<" is "<<arr[i]<<endl;
		} 
}
void stack::search(int element)
{	
		int i;
		for(i=0;i<=(size-1);i++)
		{
			if(arr[i]==element)
			{
				cout<<"Element "<<element<<" Found at Position "<<i+1<<endl;
				break;			
			}
		} 
}
void stack::remove(int position)
{
	if(isEmpty())
	{
		cout<<"Array is Empty"<<endl;
	}
	else
	{		
		move(position-1);
		this->top--;
		cout<<"\n Element deleted succssfully\n";

	}
}
void stack::count()
{
	cout<<"Count of Element is "<<top<<endl;
}
bool stack::isEmpty()
{
	if(top==-1)
	{
		return 1;
	}
	return 0;
}
bool stack::isFull()
{
	if(top==(size-1))
	{
		return 1;
	}
	return 0;
}

void stack:: min()
{
	int i,min=9999;
	for(i=0;i<=(size-1);i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}	
	}
	cout<<"min element is "<<min<<endl;
}
void stack:: max()
{
	int i,max=0000;
	for(i=0;i<=(size-1);i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}	
	}
	cout<<"max element is "<<max<<endl;
}
void stack:: avg()
{
	int avg=0,i;
	for(i=0;i<=(size-1);i++)
	{
		avg=avg+arr[i];
	}
	cout<<"Average is "<<avg/(top+1)<<endl;
}
void stack:: duplicate()
{
	int i,j;
	for(i=0;i<=(size-1);i++)
	{
		if(arr[i]==0)
		{	continue;}

		
		
		for(j=i+1;j<(size-1);j++)
		{
			if(arr[j]==0)
			{	continue;}

			if(arr[i]==arr[j])
			{	cout<<"Found Duplicate of Element "<<arr[i]<<" at position "<<i+1<<" on position "<<j+1<<endl; }
		}
	}
}
void stack:: reverse()
{
	int i,j,temp;
	for(i=0;i<=(size-1);i++)
	{
		for(j=size-1;j>=0;j--)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
void stack:: move(int position)
{
	int c;	
	if (position >= size)
        	cout<<"Deletion not possible.\n";
        else
        {
        	for (c = position; c < size - 1; c++)
         	arr[c] = arr[c+1];
		//size=size-1;
		arr[c] = 0;
	}
}

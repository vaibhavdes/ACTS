#include<iostream>
#include "queue.h"
using namespace std;

queue::queue()
{
	count=0;
	arr=NULL;
	size = 0;
}
queue::~queue()
{
	delete arr;
}

void queue::create()
{
	cout<<"Enter Size of Queue you want"<<endl;
	cin>>this->size;
	this->arr = new pqueue[this->size];

	cout<<"Queue Initialized Succesfully"<<endl;
}
void queue::insert()
{
	if(isFull())
	{
		cout<<"Queue is Full"<<endl;	
	}
	else
	{
		cout<<"Enter Data You Want to Insert"<<endl;
		cin>>arr[count].data;
	
		cout<<"Enter Priority of Data"<<endl;
		cin>>arr[count].priority;

		cout<<"Element Inserted Succesfully"<<endl;

		count++;
	}
}
void queue::remove_max()
{
	if(isEmpty())
	{
		cout<<"Queue is Empty"<<endl;	
	}
	else
	{
		int max,pos;
		int i=0;

		max=arr[0].priority;
		pos=i;
		for(;i<=(size-1);)
		{	
			i++;
			if(max < (arr[i].priority))
			{
				max=arr[i].priority;
				pos=i;	
				
			}			
		}
		
		cout<<"Max Element "<<arr[pos].data <<" Deleted Succesfully"<<endl;
		arr[pos].priority = 0;
		arr[pos].data = 0;
		
		count--;
	}

}
void queue::display()
{
	if(isEmpty())
	{
		cout<<"Queue is Empty"<<endl;	
	}
	else
	{
		int i;		
		for(i=0;i<=(size-1);i++)
		{	
			if(arr[i].priority != 0)
			{
				cout<<arr[i].data<<" - "<<arr[i].priority;
			}
			cout<<" | ";
		}
	}
	cout<<endl;
}
bool queue::isFull()
{
	return(count==size);
}
bool queue::isEmpty()
{
	return(count==0);
}

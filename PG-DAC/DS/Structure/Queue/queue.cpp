#include<iostream>
#include "queue.h"
using namespace std;

queue::queue()
{
	this->front=-1;
	this->rear=-1;
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
	this->arr = new int[this->size];

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
		if(front==-1)
			front=0;

		rear++;
		cout<<"Enter Element You Want to Insert"<<endl;
		cin>>arr[this->rear];

		cout<<"Element Inserted Succesfully"<<endl;
	}
}
void queue::remove()
{
	if(isEmpty())
	{
		cout<<"Queue is Empty"<<endl;	
	}
	else
	{
	int temp = arr[this->front];
	front++;

	cout<<"Element "<<temp<<" Deleted Succesfully"<<endl;
	}

	if(front>rear)
	{
		front=-1;
		rear=-1;
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
		for(i=front;i<=rear;i++)
		{	cout<<arr[i]<<" | ";}
	}
	cout<<endl;
}
bool queue::isFull()
{
	if(rear == size-1)
	{
		return 1;
	}
	else
		return 0;
}
bool queue::isEmpty()
{
	if(front==-1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

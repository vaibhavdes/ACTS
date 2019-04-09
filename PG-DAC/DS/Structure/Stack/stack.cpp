#include<iostream>
#include "stack.h"
using namespace std;

stack::stack()
{
	this->arr=NULL;
	this->top=-1;
}
stack::~stack()
{
	delete arr;
}
void stack::create()
{
	cout<<"Enter Size of Stack you want"<<endl;
	cin>>this->size;
	this->arr = new int[this->size];

	cout<<"Stack Initialized Succesfully"<<endl;
}
void stack::push()
{
	if(!isFull())
	{	
		int temp;
		cout<<"Enter Element to Insert"<<endl;
		cin>>temp;
		this->top++;	
		this->arr[top]=temp;		
		cout<<"Item Inserted Succesfully"<<endl;
	}
	else
	{
		cout<<"Stack is Full"<<endl;
	}
}
void stack::pop()
{
	if(isEmpty())
	{
		cout<<"Stack is Empty"<<endl;
	}
	else
	{		
		int temp;
		temp = arr[top];
		this->top--;
		cout<<"\n Element deleted succssfully "<<temp<<endl;

	}
}
void stack::peek()
{
	if(isEmpty())
        {
                cout<<"Stack is Empty"<<endl;
        }
        else
        {
		cout<<arr[top]<<endl<<endl;
	}
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


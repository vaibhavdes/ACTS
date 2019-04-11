
#include "queue.h"

template<class T>
queue<T>::queue()
{
	this->front=-1;
	this->rear=-1;
	arr=NULL;
	size = 0;
}

template<class T>
queue<T>::~queue()
{
	delete arr;
}
template<class T>
void queue<T>::create()
{
	cout<<"Enter Size of Queue you want"<<endl;
	cin>>this->size;
	this->arr = new int[this->size];

	cout<<"Queue Initialized Succesfully"<<endl;
}
template<class T>
void queue<T>::insert()
{
	if(rear==-1)
		{
			rear=0;
			front=0;
		}

	if(isFull() || arr[rear]!=0)
	{
		cout<<"Queue is Full"<<endl;	
	}
	else
	{
		
		if(rear==(size) && front!=0)
			rear=0;
		
		T element;
		cout<<"Enter Element to Add "<<endl;
		cin>>element;

		arr[rear]=element;
		rear++;
		
		
	}
		
	cout<<"In Insert"<<front<<rear<<endl;
}
template<class T>
void queue<T>::remove()
{
	if(isEmpty() || arr[front]==0)
	{
		cout<<"Queue is Empty"<<endl;	
	}
	else
	{
		T temp = arr[this->front];
		arr[front]=0;
		front++;

		cout<<"Element "<<temp<<" Deleted Succesfully"<<endl;

		if(front==(size) && rear!=0)
		{
			front=0;
			rear=0;
		}
	}

	cout<<"In Remove"<<front<<rear<<endl;
}
template<class T>
void queue<T>::display()
{
	
		T i;
		for(i=0;i<=size-1;i++)
		{
			cout<<arr[i]<<" | ";
		}
	
		cout<<endl;
	
	
}
template<class T>
bool queue<T>::isFull()
{
	if(rear == size && front==0)
	{
		return 1;
	}
	else if(front==rear+1)
	{
		return 1;
	}
		return 0;
}
template<class T>
bool queue<T>::isEmpty()
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

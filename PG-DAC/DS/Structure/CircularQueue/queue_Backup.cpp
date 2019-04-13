
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
	if(rear==size-1)
		rear=-1;

	if(isFull())
	{
		cout<<"Queue is Full"<<endl;	
	}
	else
	{
		
		if(front==-1)
			front++;
		
		T element;
		cout<<"Enter Element to Add "<<endl;
		cin>>element;

		rear++;
		arr[rear]=element;		
		
	}
		
	cout<<"In Insert"<<front<<rear<<endl;
}
template<class T>
void queue<T>::remove()
{
	if(isEmpty())
	{
		cout<<"Queue is Empty"<<endl;	
	}
	else
	{
		T temp = arr[front];
		arr[front]=0;

		cout<<"Element "<<temp<<" Deleted Succesfully"<<endl;

		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			front++;
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
	return(rear == (size-1) || front==rear+1)	;
}
template<class T>
bool queue<T>::isEmpty()
{
	return(front==-1 && rear==-1);
}


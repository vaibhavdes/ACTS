
#include "linkedlist.h"

template <class T>
list<T>::list()
{
	head=NULL;
	tail=NULL;
	count=0;
}

template <class T>
void list<T>::insert_start()
{
	node<T> *temp = new node<T>;
	node<T> *p = head;
	cout<<"Enter Value to Store in Node"<<endl;
	cin>>temp->data;
	
	if(head==NULL)
	{
		head=temp;
		tail=temp;
			temp->next = temp;
			temp->prev = temp;
		temp=NULL;
		count++;
	}
	else
	{
		while(p->next!=head)
		{
			p=p->next;
		}

		p->next = temp;
		temp->next = head;
		temp->prev = head->prev;
		head->prev = temp;
		head=temp;
		temp = NULL;
		count++;
	}
}
template <class T>
void list<T>::insert_end()
{
	node<T> *temp = new node<T>;
	cout<<"Enter Value to Store in Node"<<endl;
	cin>>temp->data;
	
	if(head==NULL)
	{
		head=temp;
		tail=temp;
			temp->next = temp;
			temp->prev = temp;
		temp=NULL;
		count++;
	}
	else
	{
		temp->next = tail->next;		//head
		temp->prev = tail;
		tail->next = temp;
		head->prev = temp;
		tail=temp;
		temp=NULL;
		count++;
	}
}
template <class T>
void list<T>::insert_pos()
{
	node<T> *temp = new node<T>;
	node<T> *i;
	node<T> *previous;
	
	cout<<"Enter Value to Store in Node"<<endl;
	cin>>temp->data;

	int pos;
	cout<<"Enter Position Where to Insert"<<endl;
	cin>>pos;

	if(head==NULL)
	{
		head=temp;
		tail=temp;
			temp->next = temp;
			temp->prev = temp;
		temp=NULL;
		count++;
	}
	else
	{
		int j=1;
		i=head;

		while(j<pos)
		{
			previous=i;
			i=i->next;
			j++;
		}

			previous->next = temp;
			temp->prev = previous;
			temp->next = i;
			i->prev = temp;
			temp=NULL;

		count++;	
	}
}
template <class T>
void list<T>::display()
{

	if(count==0)
	{
		cout<<"Nothing To Show"<<endl;
	}
	else
	{
		node<T> *temp = new node<T>;
		temp = head;
	
		do
		{
			cout<<"Node Data: "<<temp->data<<endl;
			temp=temp->next;

		}while(temp!=head);
	
		temp=NULL;
	}

}
template <class T>
void list<T>::delete_start()
{
	if(count==0)
	{
		cout<<"Nothing To Delete"<<endl;
	}
	else
	{
		node<T> *temp = new node<T>;
		node<T> *previous;	

		temp=head;

		previous = head->prev;

		head=head->next;
		previous->next = head;
		head->prev = previous;
	
		delete temp;
	
		count--;
	}
}
template <class T>
void list<T>::delete_end()
{
	if(count==0)
	{
		cout<<"Nothing To Delete"<<endl;
	}
	else
	{
		node<T> *temp;
		node<T> *prev;

		temp=tail;
	
		tail=tail->prev;

		tail->next = head;
		head->prev = tail;

		delete temp;

		count--;
	}
}
template <class T>
void list<T>::counts()
{

	cout<<"Count of Element is "<<count<<endl;
	
}

#include<iostream>
#include "linkedlist.h"
using namespace std;

list::list()
{
	head=NULL;
	tail=NULL;
	count=0;
}
void list::insert_end()
{
	node *temp = new node;
	cout<<"Enter Value to Store in Node"<<endl;
	cin>>temp->data;
	
	temp->next = NULL;

	if(head==NULL)
	{
		temp->prev=NULL;
		head=temp;
		tail=temp;
		temp=NULL;
		count++;
	}
	else
	{
		temp->prev=tail;
		tail->next=temp;
		tail=temp;
		count++;
	}
}
void list::insert_pos()
{
	node *temp = new node;
	node *i = new node;
	node *prev = new node;
	
	cout<<"Enter Value to Store in Node"<<endl;
	cin>>temp->data;
	temp->next = NULL;

	int pos;
	cout<<"Enter Position Where to Insert"<<endl;
	cin>>pos;

	if(head==NULL)
	{
		head=temp;
		tail=temp;
		temp=NULL;
		count++;
	}
	else
	{
		int j=1;
		i=head;

		while(j<pos)
		{
			prev=i;
			i=i->next;
			j++;
		}
			temp->prev=prev;
			temp->next=i;
			prev->next=temp;
			temp=NULL;

		count++;	
	}
}

void list::display()
{

if(count==0)
{
	cout<<"Nothing To Show"<<endl;
}
else
{
	node *temp = new node;
	temp = head;
	while(temp!=NULL)
	{
		cout<<"Node Data: "<<temp->data<<endl;
		temp=temp->next;
	}
	temp=NULL;
}

}
void list::reverse_display()
{

if(count==0)
{
	cout<<"Nothing To Show"<<endl;
}
else
{
	node *temp = new node;
	temp = tail;
	while(temp!=NULL)
	{
		cout<<"Node Data: "<<temp->data<<endl;
		temp=temp->prev;
	}
	temp=NULL;
}

}
void list::insert_start()
{
	node *temp = new node;

	cout<<"Enter Value to Store in Node"<<endl;
	cin>>temp->data;


	if(head==NULL)
	{
		temp->prev=NULL;
		head=temp;
		tail=temp;
		temp=NULL;
		count++;
	}
	else
	{
		temp->next = head;
		head->prev = temp;	
		head = temp;
		count++;
	}
}
void list::delete_start()
{
if(count==0)
{
	cout<<"Nothing To Delete"<<endl;
}
else
{
	node *temp = new node;
	temp=head;
	head=head->next;

	delete temp;
	
	count--;
}
}
void list::delete_end()
{
if(count==0)
{
	cout<<"Nothing To Delete"<<endl;
}
else
{
	node *temp = new node;
	node *prev = new node;
	temp=head;
	
	while(temp->next!=NULL)
	{
		prev=temp;
		temp=prev->next;
	}
	tail=prev;
	prev->next = NULL;
	delete temp;

	count--;
}
}
void list::counts()
{

	cout<<"Count of Element is "<<count<<endl;
	
}

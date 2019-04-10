#include<iostream>
#include "clinkedlist.h"
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
	
	temp->next = head;

	if(head==NULL)
	{
		head=temp;
		tail=temp;
		temp=NULL;
		count++;
	}
	else
	{
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
	while(temp->next!=head)
	{
		cout<<"Node Data: "<<temp->data<<endl;
		temp=temp->next;
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
		head=temp;
		tail=temp;
		temp=NULL;
		count++;
	}
	else
	{
		temp->next = head;
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
	
	while(temp->next!=head)
	{
		prev=temp;
		temp=prev->next;
	}
	tail=prev;
	prev->next = head;
	delete temp;

	count--;
}
}
void list::counts()
{

	cout<<"Count of Element is "<<count<<endl;
	
}

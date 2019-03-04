#include<iostream>
#include <string>
#include "phone.h"
using namespace std;

Phone::Phone()
{
	modelNo = 0;
	price = 0;
	manufacturer = "";
	quantity = 0;
}
Phone::Phone(int m,int p,string mF, int q)
{
	modelNo = m;
	price = p;
	manufacturer = mF;
	quantity = q;
}
void Phone::Accept()
{
	cout<<"\n Enter Model No e.g 1234"<<endl;
	cin>>modelNo;
	cout<<"\n Enter Price"<<endl;
	cin>>price;
	cout<<"\n Enter Manufacturer e.g Nokia"<<endl;
	cin>>manufacturer;
	cout<<"\n Enter Quantity in stock of "<<modelNo<<endl;
	cin>>quantity;
}
void Phone::Display()
{
  cout<<"\n"<<modelNo<<"\t"<<price<<"\t"<<manufacturer<<"\t"<<quantity<<endl;
}
void Phone::Search(int model)
{
	for(int i=0;i<size;i++)
	{
		if(p[i].modelNo  == model)
			cout<<"\n"<<p[i].modelNo<<"\t"<<p[i].price<<"\t"<<p[i].manufacturer<<"\t"<<p[i].quantity<<endl;
	}
}
void Phone::Add(int m,int p,string mF, int q,Phone [])
{}
void Phone::List(Phone p[],int size)
{
	for(int i=0;i<size;i++)
		{
			cout<<"\n"<<p[i].modelNo<<"\t"<<p[i].price<<"\t"<<p[i].manufacturer<<"\t"<<p[i].quantity<<endl;
		}
}
void Phone::Qty(Phone p[],int m,int size)
{
	for(int i=0;i<size;i++)
	{
		if(p[i].modelNo  == m)
			cout<<"\n Quantity is : "<<quantity<<endl;
	}
}
void Phone::Avl(Phone p[],int m,int size)
{
	for(int i=0;i<size;i++)
		{
			if(p[i].modelNo  == m)
			{
				if(p[i].quantity > 0)
					cout<<"\n In stock";
				else
					cout<<"\n Out of Stock";
			}
		}
}


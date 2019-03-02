#include <iostream>
#include <string>
#include "phone.h"
#define SIZE 5
using namespace std;

int main() {

//	Phone p;
//	p.Display();

//	Phone p(10,500,"Nokia",5);
//	p.Display();

//	Phone p;
//	p.Accept();
//	p.Display();

//	Phone *p = NULL;
//	p = new Phone;
//	p->Accept();
//	p->Display();

	int count= 0;
	int n,cmd,modelNo;

//	Phone *p;
//	cout<<"\n Enter Count of Mobile Phones in Store"; //Do not Enter More otherwise we will loot it
//	cin>>n;
//	a = new int[n];
//	p = new Phone[n];

	Phone arr[5];
	Phone p1;

	do
	{
		cout<<"\n Options";
		cout<<"\n 1. Add Mobile";
		cout<<"\n 2. Display List of Available Mobile";
		cout<<"\n 3. Find Qty of Mobile Type";
		cout<<"\n 4. Find Availability of Particular model";
		cout<<"\n 0. Exit";
		cin>>cmd;

		switch(cmd)
		{
		default:
				cout<<"\n Press Valid Option";
				break;
		case 1: p1.Accept();
				arr[count] = p1;
				count++;
				break;
		case 2:	cout<<"\n modelNo \t price \t manufacturer \t quantity"<<endl;
				p1.List(arr,count);
				break;
		case 3:	cout<<"Enter Model No";
				cin>>modelNo;
				p1.Qty(arr,modelNo,count);
				break;
		case 4: cout<<"Enter Model No";
				cin>>modelNo;
				p1.Avl(arr,modelNo,count);
				break;

		}
	}while(cmd!=0);


	return 0;
}

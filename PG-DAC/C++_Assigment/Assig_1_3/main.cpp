#include <iostream>
#include "date.h"
using namespace std;
int main()
{
	Dates d;
	int dd,m,y;
	int d2,m1,y1;
	int days;

	cout<<"\n With Constructor"<<endl;
	d.show();

	Dates d1(12,10,1998);
	cout<<"\n Paramaterised Constructor"<<endl;
	d1.show();

	Dates d3,d4;
	d3.accept();
	d3.show();

	cout<<"\n Enter Date to compare with"<<endl;
	cout<<"\n Enter Date"<<endl;
	cin>>d2;
	cout<<"\n Enter Month"<<endl;
	cin>>m1;
	cout<<"\n Enter Year"<<endl;
	cin>>y1;
	d3.difference(d2,m1,y1);


	d4.accept();
	if(d3 == d4)
	{
		cout<<"Date is matching";
	}
	else
	{
		cout<<"Date is not matching";
	}

	if(d3 != d4)
	{
		cout<<"Date not equal";
	}
	else
	{
		cout<<"Date are equal";
	}

	days = d4 - d3;
	cout<<"\n Days Difference is"<<days;
return 0;
}

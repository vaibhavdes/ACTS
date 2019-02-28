#include <iostream>
#include "date.h"
using namespace std;
int main()
{
	Dates d;
	int dd,m,y;
	int d2,m1,y1;

	cout<<"\n With Constructor"<<endl;
	d.show();

	Dates d1(12,10,1998);
	cout<<"\n Paramaterised Constructor"<<endl;
	d1.show();

	Dates d3;
	cout<<"\n Enter Date"<<endl;
	cin>>dd;
	cout<<"\n Enter Month"<<endl;
	cin>>m;
	cout<<"\n Enter Year"<<endl;
	cin>>y;

	d3.accept(dd,m,y);
	d3.show();

	cout<<"\n Enter Date to compare with"<<endl;
	cout<<"\n Enter Date"<<endl;
	cin>>d2;
	cout<<"\n Enter Month"<<endl;
	cin>>m1;
	cout<<"\n Enter Year"<<endl;
	cin>>y1;
	d3.difference(d2,m1,y1);


return 0;
}

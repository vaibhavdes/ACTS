#include<iostream>
#include "student.h"
using namespace std;
Dates::Dates()
{
	dd = 0;
	mm = 0;
	yyyy = 0;
}	
Dates::Dates(int d,int m,int y)
{
	dd = d;
	mm = m;
	this->yyyy = y;
}
void Dates::accept(int d,int m,int y)
{
	dd = d;
	mm = m;
	yyyy = y;
}
void Dates::show()
{
	cout<<"\n Day "<<dd;
	cout<<"\n Month "<<mm;
	cout<<"\n Year "<<yyyy;
}

void Dates::difference(int d,int m,int y)
{
	int tdays,tdays1;
	int d1,m1,d2,m2;

	tdays = days(m,y);
	tdays1 = days(mm,yyyy);

	//Iterator Variables
	int t_days = 0, t_month = 0;
	int i,j,k,l,m,n;
	
	// Year is same
	if(y==yyyy)
	{
		//Month is same
		if(m == mm)
		{	
			if(d>dd)
				t_days = d - dd;
			else
				t_days = dd - d;
		}
		else
		{
			//Month Not Same
		}
	}
	// Year Not Same
				    
	/*
	if(y>yyyy)
	{
		cout<<"\n"<<y - yyyy<<" years";
		d1 = d;
		m1 = m;
		d2 = dd;
		m2 = mm;
	}
	else if(y<yyyy)
	{
		d1 = dd;
		m1 = mm;
		d2 = d;
		m2 = m;
		cout<<"\n"<<y - yyyy<<" years";
	}
	*/

	/*
	int i,j,temp = 0, temp1 = 0;
	for(i = m1; i<=m2; i++)
	{
		for(j = d1; j <= d2; j++)
		{
			if(d1<=tdays)
			{
				j = 1;
				continue;
			}
			temp++;
			cout<<"Test"<<j<<temp;
		}
		temp1++;
	}
	*/
	
	
	cout <<"\n"<<temp1<<" month";
	cout <<"\n"<<temp<<" days";
	
}

int Dates::days(int m,int y)
{
	int tdays;
	if(y%4 == 0)
	{
		if(m == 2)
			tdays = 29; 
	}	
	else
	{
		if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			tdays = 31;
		else if(m == 4 || m == 6 || m == 9 || m == 1)
			tdays = 30;
		else
			tdays = 28;
	}
	return tdays;
}

/*
void Date::compare(int d,int m,int y)
{

}
*/

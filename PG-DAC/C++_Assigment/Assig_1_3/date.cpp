#include<iostream>
#include "date.h"
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
	cout<<"\n Enter Date"<<endl;
	cin>>dd;
	cout<<"\n Enter Month"<<endl;
	cin>>mm;
	cout<<"\n Enter Year"<<endl;
	cin>>yyyy;
}
void Dates::show()
{
	cout<<"\n Day "<<dd;
	cout<<"\n Month "<<mm;
	cout<<"\n Year "<<yyyy;
}

void Dates::difference(int d,int m,int y)
{	
	int y_t;
	int t_y;
	int d_y = 0,i;
	int y_d = 0,j;
	int l,n,total_days = 0,total_months = 0;

	(yyyy%4==0)?(y_t = 366):(y_t = 365); // Start Year
	(y%4==0)?(t_y = 366):(t_y = 365); // End Year

	//Start Day
	for(i = mm + 1; i <= 12;i++)
	{
		d_y = d_y + days(i,yyyy);
		total_months = total_months + 1;
	}
		d_y = d_y + (days(mm,yyyy) - dd);

	//End Day
	for(j = 1; j < m ; j++)
	{
		y_d = y_d + days(j,y);
		total_months = total_months + 1;
	}
		y_d =  y_d + d;

	if(y>yyyy && y!=yyyy)
	{
		for(l = yyyy + 1;l < y; l++)
		{
			for(n = 1; n <= 12; n++)	
			{	
				total_days = total_days + days(n,l);
				total_months = total_months + 1;
			}
		}
	}
	
	total_days = total_days + y_d + d_y;	
	
	cout<<total_days<<" Days\n"<<endl;
	cout<<total_months<<" Months\n"<<endl;		//Unverified
	cout<<y - yyyy<<" Years\n"<<endl;	
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

void Dates::compare(int d,int m,int y)
{
	if(dd == d && mm == m && yyyy == y)
	{
		cout<<"Date is matching";
	}
	else
	{
		cout<<"Date is not matching";
	}
}

bool Dates::operator==(Dates &d)
{
	if(dd == d.dd && mm == d.mm && yyyy == d.yyyy)
	{
		return 1; //cout<<"Date is matching";
	}
	else
	{
		return 0; //cout<<"Date is not matching";
	}
}

bool Dates::operator!=(Dates &d)
{
	if(dd != d.dd && mm != d.mm && yyyy != d.yyyy)
	{
		return 1; //cout<<"Date is matching";
	}
	else
	{
		return 0; //cout<<"Date is not matching";
	}
}

int Dates::operator -(Dates &d)
{
	int y_t;
	int t_y;
	int d_y = 0,i;
	int y_d = 0,j;
	int l,n,total_days = 0,total_months = 0;

	(yyyy%4==0)?(y_t = 366):(y_t = 365); // Start Year
	(d.yyyy%4==0)?(t_y = 366):(t_y = 365); // End Year

	//Start Day
	for(i = mm + 1; i <= 12;i++)
	{
		d_y = d_y + days(i,yyyy);
		total_months = total_months + 1;
	}
		d_y = d_y + (days(mm,yyyy) - dd);

	//End Day
	for(j = 1; j < d.mm ; j++)
	{
		y_d = y_d + days(j,d.yyyy);
		total_months = total_months + 1;
	}
		y_d =  y_d + d.dd;


	if(d.yyyy>yyyy && d.yyyy!=yyyy)
	{
		for(l = yyyy + 1;l < d.yyyy; l++)
		{
			for(n = 1; n <= 12; n++)
			{
				total_days = total_days + days(n,l);
				total_months = total_months + 1;
			}
		}
	}

	total_days = total_days + y_d + d_y;

	return total_days;
}







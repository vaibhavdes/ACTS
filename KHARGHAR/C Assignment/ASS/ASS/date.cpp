/*
 * date.cpp
 *
 *  Created on: Feb 28, 2019
 *      Author: Vaibhav Kurkute
 */

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
{	int year,day_cnt = 0;
	int cnt_year;
	int abs = 0;
	int grt_year,sml_year;
	int srt_month,srt_day,end_month,end_day;

	(y > yyyy)?(grt_year = y, sml_year=yyyy):(sml_year = yyyy, grt_year = y);

	(y > yyyy)?(cnt_year = yyyy,end_month = mm, end_day = dd, srt_day = d, srt_month = m):(cnt_year = y, end_month = m, end_day = d, srt_day = dd, srt_month = mm);

	(y == yyyy)?(m > mm)?(srt_month = mm, end_month = m):(srt_month = m, end_month = mm):(srt_month = m, end_month = mm);

	int i;
	year = yearDiff(y,yyyy);

	for(i = 1; i <= year;i++)
	{
		//Flag for Different Years
		if(cnt_year!=y && cnt_year!=yyyy)
		{
			day_cnt = day_cnt + count_Y_Days(1,12,cnt_year);
		//	cout<<"\n Test 1 "<<day_cnt;

		}

		//Flag for Same Starting Year
		if(cnt_year==sml_year)
		{
			day_cnt = (day_cnt + count_Y_Days(srt_month,end_month,sml_year)) + srt_day - end_day;
			cout<<"\n Test 2 "<<day_cnt;

		}

		//Flag for Same Ending Year
		if(cnt_year==grt_year)
		{
			abs = end_day - days(end_month,grt_year);
			day_cnt = day_cnt + count_Y_Days(1,end_month,sml_year);
		//	cout<<"\n Test 3"<<day_cnt;

		}

		cnt_year++;
	}

	cout<<"\n"<<day_cnt<<" day_cnt";

}

int Dates::yearDiff(int y1,int y2)
{
	int d;
	d = (y1>y2)?(y1-y2):(y2-y1);
	cout<<"\n"<<d<<" Years";

	if(y1==y2)
	{
		d = 1;
		cout<<"\n"<<"0";
	}

	return d;
}

int Dates::count_Y_Days(int m1,int m2,int y1)
{
	int i,y = 0;
	for(i = m1; i<=m2;i++)
	{
		y = y + days(i,y1);
	//	cout<<"\n Test "<<i<<" "<<y;
	}
	return y;
}

int Dates::days(int m,int y)
{
	int tdays;

	if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
	{	tdays = 31;	}
	else if(m == 4 || m == 6 || m == 9 || m == 11)
	{	tdays = 30;	}
	else if(m == 2)
	{
		if(y%4 == 0)
			{
					tdays = 29;
			}
			else
			{
					tdays = 28;
			}
	}

	//cout<<"\n Test "<<tdays;
	return tdays;
}



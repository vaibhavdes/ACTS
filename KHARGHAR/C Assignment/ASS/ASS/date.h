/*
 * date.h
 *
 *  Created on: Feb 28, 2019
 *      Author: Vaibhav Kurkute
 */

#ifndef DATE_H_
#define DATE_H_

#include<iostream>
using namespace std;
class Dates
{
	int dd, mm, yyyy;
public:
	Dates();
	Dates(int d,int m,int y);
	void accept(int d,int m,int y);
	void show();
	void difference(int d,int m,int y);
	int yearDiff(int y,int x);
	int count_Y_Days(int m1,int m2,int y);
	int days(int d,int y);
};

#endif /* DATE_H_ */

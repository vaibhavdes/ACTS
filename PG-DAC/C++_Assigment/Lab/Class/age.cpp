/*
 * age.cpp
 *
 *  Created on: Mar 6, 2019
 *      Author: Vaibhav Kurkute
 */

#include<iostream>
#include<string.h>
#include "age.h"
using namespace std;
int len = 0;
	Student::Student()
	{
		cout<<"Student CTOR Called \n"<<endl;
		name = '\0';
		school = NULL;
	}

	Student::Student(const char *s)
	{
		len = strlen(s);
		school = new char[len + 1];
		strcpy(school,s);
		cout<<this->school;
	}

	void Student::Display()
	{
			cout<<name<<endl;
			cout<<school<<endl;
	}

	Student::~Student()
	{
		cout<<"Student DTOR Called \n"<<endl;
	}

	Age::Age():height(0), weight(0)		//Initializer List
	{
		cout<<"Age CTOR Called \n"<<endl;
		//Keeping Empty is fine but "Ab kiya hai toh dalna padega"
//		name 	= '\0';		//For Single Character single quote
							//For String Double Quote
//		school = '\0';
	}

	Age::Age(int h,int w,string n,char *s)
	{
		this->height = h;
		weight = w;
//		name = n;
//		this->school = s;
	}

	Age::Age(const Age &a)
	{
		this->height = a.height;
		weight = a.weight;
//		name = a.name;
//		school = a.school;
	}

	Age::Age(Age *a)
	{
			this->height = a->height;
			weight = a->weight;
//			name = a->name;
//			school = a->school;
	}

	void Age::Display()
	{
		cout<<"\n----"<<endl;
		cout<<height;
		cout<<weight;
		cout<<"---- \n"<<endl;

	}

/*	int Age::ReRoll(Age a,int s)
	{
		a.roll = s;
	}
	*/

	/*ostream&  operator<<(ostream& cout, Age &a)
	{
		cout << a.height << endl;
		cout << a.name << endl;
		return cout;
	}

	istream& operator>>(istream& cin, Age &a)
	{
		cin >> a.height;
		cin >> a.weight;
		return cin;
	}
	*/

	Age::~Age()
	{
			cout<<"Age DTOR Called \n"<<endl;
	}





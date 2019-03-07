#include<iostream>
#include "age.h"
#include <string>
using namespace std;	
	Basic::Basic()	
	{	
		cout<<"\n Derived CTOR"<<endl;
		height = 0;
		weight = 0;
	
	}

//	For Inheritance
//	Basic::Basic(int ht,int wt, char* nm, int rn , string sn ):Student(nm,rn,sn)
	Basic::Basic(int ht,int wt, char* nm, int rn , string sn ):s(nm,rn,sn)
	{
		cout<<"\n Derived P CTOR"<<endl;
		height = ht;
		weight = wt;
	}
	Basic::Basic(const Basic &b)
	{
		height = b.height;
		weight = b.weight;
	}
	Basic::Basic(Basic *b)
	{
		height = b->height;
		weight = b->weight;
	}
	void Basic::Display()
	{
		//Student::Display();
		s.Display();
		cout<<height<<endl;
		cout<<weight;
	}
	Basic::~Basic()
	{	
		cout<<"\n Derived DTOR"<<endl;
	}

	Student::Student()
	{
		cout<<"\n Base CTOR"<<endl;
	}
	Student::Student(char *n,int i,string s)
	{
		cout<<"\n Base P CTOR"<<endl;
		name = n;
		rollno = i;
		school = s;
	}
	void Student::Display()
	{
		//cout<<name<<endl;
		cout<<rollno<<endl;
		cout<<school<<endl;
	}
	Student::~Student()
	{
		cout<<"\n Base DTOR"<<endl;
	}

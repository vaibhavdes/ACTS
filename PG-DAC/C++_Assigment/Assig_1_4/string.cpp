#include<iostream>
#include<cstring>
#include "string.h"
using namespace std;

MyString::MyString()
{
	size = 0;
	p = new char;
	*p = '\0';
}

MyString::MyString(char *str)
{
	size = strlen(str);
	p = new char[size + 1];
	strcpy(p,str);
}

MyString::~MyString()
{
	delete p;
}

MyString::MyString(const MyString &s)
{
	size = s.size;
	p = new char[size + 1];
	strcpy(p,s.p);
}

void MyString::accept()
{
	char temp[20];
	cout<<"enter string";
	cin>>temp;
	size=strlen(temp);
	p=new char[size+1];
	strcpy (p,temp);
}
void MyString::display()
{
	cout<<p<<endl;
}

#include "age.h"
#include<iostream>
using namespace std;

int main()
{
//For Inheritance
/*	{
	Basic b;
	Student* s = &b;
	s->Display();
	}
	cout<<"Parameterized Object"<<endl;

	Basic b2(30,40,"ABC",1,"DAV");
	b2.Display();
	
	cout<<"Copy Ctor"<<endl;
	Basic b1(b2);
	b1.Display();
	cout<<"Copy through Pointer"<<endl;
	Basic b3(&b2);
	b3.Display();
*/

// For Association
	Basic b;
	b.Display();

	cout<<"Parameterized Object"<<endl;

	Basic b2(30,40,"ABC",1,"DAV");
	b2.Display();
	
	return 0;
}

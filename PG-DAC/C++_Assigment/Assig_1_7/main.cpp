#include<iostream>
#include<stdio.h>
#include<string>
#include "pay.h"
using namespace std;

int main()
{

	Payslip p;
	cout<<"\n Default Constructor \n"<<endl;
	p.display();

	cout<<"\n Parametrised Constructor \n"<<endl;
	Payslip p1(21,"Amey",2,3,5);
	p1.display();

	p1.input();
	p1.display();
	p1.calculate();

//~p1;
	return 0;
}

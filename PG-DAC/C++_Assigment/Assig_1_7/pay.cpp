#include<iostream>
#include<stdio.h>
#include<string>
#include "pay.h"
using namespace std;
Payslip::Payslip()
{
	this->emp_no = 0;
	this->emp_name = '\0';
	this->da = 0;
	this->hra = 0;
	this->basic_salary = 0;
}

Payslip::Payslip(int e,string n,int d,int h,int b)
{
	this->emp_no = e;
	this->emp_name = n; //strcpy(this->emp_name,n)#include<string>
	this->da = d;
	this->hra = h;
	this->basic_salary = b;
}
void Payslip::input() //void Payslip::input(int e,string n,int d,int h,int b)
{
	cout<<"\n Enter Emp No"<<endl;
	cin>>emp_no;
	cout<<"\n Enter Emp Name"<<endl;
	cin>>emp_name;
	getchar();
  
  /*
  cout<<"\n Enter Emp DA"<<endl;
	cin>>da; 
	cout<<"\n Enter Emp HRA"<<endl;
	cin>>hra;
  */
  
	cout<<"\n Enter Emp Basic Salary"<<endl;
	cin>>basic_salary;
}
void Payslip::display()
{
	cout<<"Emp_No "<<emp_no<<endl;
	cout<<"Emp Name "<<emp_name<<endl; 
	cout<<"Emp DA "<<((40 * this->basic_salary)/100)<<endl;
	cout<<"Emp HRA "<<((50 * this->basic_salary)/100)<<endl;
	cout<<"Emp Basic Salary "<<basic_salary<<endl;
}
void Payslip::calculate()
{
	cout<<"\n Salary is "<<this->basic_salary + ((40 * this->basic_salary)/100) + ((50 * this->basic_salary)/100)<<endl;
}

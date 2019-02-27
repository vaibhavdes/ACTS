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
	int days(int d,int y);
/*
	void compare(int d,int m,int y);
*/
	

};

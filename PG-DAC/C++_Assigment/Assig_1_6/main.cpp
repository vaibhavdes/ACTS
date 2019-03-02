
#include<iostream>
#include<cstring>
#include "address.h"
using namespace std;
int main()
{
	bool flag = 0; 
	
	Address a(0,"www","aaa","bbb",234);
	a.display();

	Address b;
        b.accept();
        b.display();

	flag = (b == a);
	if(flag)
	{
		cout<<"Same";
	}
	else 
	{
		cout<<"Different";
	}	

	return 0;
}


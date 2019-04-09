#include<iostream>
#include<cstdlib>
#include "stack.h"
using namespace std;

int main()
{
	stack s;
	s.create();

	int option=1;
	
	while(option!=0)
	{
		cout<<"1.Push \n2.Pop \n3.Peek \n0.Exit\n"<<endl;
		cin>>option;

		switch(option)
		{
			case 1:
				s.push();
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.peek();
				break;
			case 0:
				exit(0);
		}
	}
}

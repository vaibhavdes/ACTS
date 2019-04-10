#include<iostream>
#include<cstdlib>
#include "queue.h"
using namespace std;

int main()
{
	queue q;

	q.create();
	
	int option=1;
	
	while(option!=0)
	{
		cout<<"1.Insert \n2.Remove \n3.Display \n0.Exit\n"<<endl;
		cin>>option;

		switch(option)
		{
			case 1:
				q.insert();
				break;
			case 2:
				q.remove();
				break;
			case 3:
				q.display();
				break;
			case 0:
				exit(0);
		}
	}	
}

#include<iostream>
#include "array.h"
using namespace std;

int main()
{
	stack a;

	int size,element,pos;	
	int option=1;

	cout<<"Enter Size of Array";
	cin>>size;

	a.create(size);

	while(option!=0)
	{
		cout<<"MENU\n";
		cout<<"1. Insert Element\n";
		cout<<"2. Display Element\n";
		cout<<"3. Remove Element\n";
		cout<<"4. Find Min Element\n";
		cout<<"5. Find Max Element\n";
		cout<<"6. Search Element\n";
		cout<<"7. Array Element Count\n";
		cout<<"8. Average of Array Elements\n";
		cout<<"9. Find Duplicate Element\n";
		cout<<"10. Reverse Elements\n";
		cin>>option;
		
		switch(option)
		{
			case 1:	
				
				if(a.isFull())
				{
					cout<<"Array is Full"<<endl;
				}
				else
				{	
					cout<<"Enter Position";
					cin>>pos;

					cout<<"Enter Element";
					cin>>element;

					a.insert(element,pos);
				}
				break;
			case 2:
				a.display();
				break;
			case 3:
				if(a.isEmpty())
				{
					cout<<"Array is Empty"<<endl;
				}
				else
				{	
					cout<<"Enter Position";
					cin>>pos;
					
					a.remove(pos);
				}
				break;
			case 4:
				a.min();
				break;
			case 5:
				a.max();
				break;	
			case 6:
				cout<<"Enter Element to Search";
				cin>>element;
				a.search(element);
				break;
			case 7:
				a.count();
				break;
			case 8:
				a.avg();
				break;
			case 9:
				a.duplicate();
				break;
			case 10:
				a.reverse();
				break;
			case 0:
				break;
		}
	
	}

	return 0;
}

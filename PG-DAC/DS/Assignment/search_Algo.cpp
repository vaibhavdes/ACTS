
#include<iostream>
using namespace std;

void linearSearch(int *arr,int size)
{
	int i,pos,term;
	cout<<"Enter Element to Search"<<endl;
	cin>>term;
	
	for(i=0;i<size;i++)
	{
		if(arr[i]==term)
		{
			pos=i;
			break;
		}
	}
	cout<<"Found Element "<<term<<" at position"<<pos<<endl;
}

int binarySearch(int *arr,int size)
{
	int i=0,pos,term;
	cout<<"Enter Element to Search"<<endl;
	cin>>term;

	int mid;

	while(i<=size)
	{

			mid = (i + size)/2;


			if (arr[mid]==term)
				return mid;

			if(arr[mid]<term)
				i=mid+1;
			else
				size=mid-1;

	}
	return -1;
}

int main()
{
	int option;
	int size;
	int *arr;
	int pos;

	cout<<"Enter Size of Array"<<endl;
	cin>>size;
	arr = new int[size];

	int i;
	for(i=0;i<size;i++)
	{
	cout<<"Enter Element in sorted form "<<i<<endl;
	cin>>arr[i];
	}
	
	cout<<"Press    1. Linear Search |  2. Binary Search"<<endl;
	cin>>option;

	switch(option)
	{
		case 1:
			linearSearch(arr,size);
			break;
		case 2:
			pos=binarySearch(arr,size);
			cout<<"Element Found at "<<pos<<endl;
			break;
	}
	return 0;
}

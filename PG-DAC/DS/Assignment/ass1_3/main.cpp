#include<iostream>
using namespace std;

int main()
{
	//USED FOR QUEUE,STACK

	int *a;
	a = new int[5];
	
	a[0] = 21;
	cout<<a[0]<<endl;

	delete[] a;
	

	//USED FOR GRAPH


	//1) Fixed Coloumn - 
	int **b;
		
		//Rows
		b = new int*[5];
	
		//For Each Coloumns
		//Can use (For Loop 5) times
		b[1] = new int[5];

		b[1][2] = 23;

		cout<<b[1][2]<<endl;
		
		//Remove For Each Coloumn
		delete[] b[1];

	delete[] b;

	
}

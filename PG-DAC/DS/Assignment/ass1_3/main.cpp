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


	//1) Contiguous Rows - 
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

	//2) Fixed Coloum | Non Contiguous Row
		int (*a)[2];
			a = new int [3][2];

			//Can Use Loop for Each Row
			a[0][1] = 12;
			cout<<a[0][1];
		delete a;
	
}

#include<iostream>
using namespace std;

int main()
{

	//Pointer
	//int p = 30;	//Initialization
	//int *s = NULL; 	//Pointer Initialize with NULL
	//s = &p; //Pointer contain value (address of p)
	//const int *s = NULL; 
	//*s = 40;		//error
	//int * const s = NULL; 
	//s = &p;		//error
	//cout<<*s<<endl;

	//Memory Allocation
	//int *p = new int;
	//*p = 30;
	//int *p = new int(30);
	//cout<<*p;
	//delete p;		//Free the Memory

	//int *p = new int[3];	//Pointer Array
	//p[0] = 30;
	//p[1] = 40;
	//int s = 50;
	//p[2] =  &s;		//error
	//cout<<p[0]<<p[3];
	//cout<<*p[2];		//error
	//delete []p;		//Free the Memory otherwise memory leak

	//char *p[3];		//Array of Pointer
	//p[0] = "Priya";
	//p[1] = "Shubha";	
	//cout<<p[1]<<endl<<*p[2]<<*p[1];

	//char p[3][10] = {"Priya","Shubha","Aradhya"};
	//char (*ptr)[10];		//Pointer to Array
	//ptr = p;
	//cout << *ptr[1] <<endl<<*(*(p+1)+2)<<endl << ptr[1];


return 0;
}

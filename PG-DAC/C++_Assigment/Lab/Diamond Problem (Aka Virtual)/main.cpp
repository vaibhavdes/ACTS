#include<iostream>
#include "Animal.h"
using namespace std;

int main()
{
	Liger l1;
	//l1.setWeight(5);
	//Error: request for member ‘setWeight’ is ambiguous
	

	//l1.Lion::setWeight(5); //Solution : 1 - Specific Class Scope
	
	l1.setWeight(5);
}

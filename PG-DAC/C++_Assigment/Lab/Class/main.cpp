//============================================================================
// Name        : ageClass.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "age.h"
using namespace std;

int main() {
	Student *s;
	Age a;

	s = &a;

	s->Display();

	return 0;
}

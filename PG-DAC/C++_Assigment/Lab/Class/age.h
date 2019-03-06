/*
 * age.h
 *
 *  Created on: Mar 6, 2019
 *      Author: Vaibhav Kurkute
 */

#ifndef AGE_H_
#define AGE_H_

#include<string>	//As string data member is included here itself in header
#include<iostream>
using namespace std;

class Student
{
private:
	string name;
	char * school;
	static int roll;

public:
	Student();
	Student(const char *);
	virtual void Display();		//Virtual Due to same Function Names
//	Student(const Student &);
	virtual ~Student();			//Virtual Destructor for correct calling conventions
};

class Age : public Student		//Inheritence
{
private:		//Even not mentioned it will be private unless you mention public
	int height;
	int weight;
	Student s;					//Association
public:
	Age();
	Age(int,int,string,char *);
	Age(const Age &);
	Age(Age *);		//Copy Constructor - Deep T***** Copy //Polymorphism
	void Display();
	void Accept();

//	static void ReRoll(Age,int);
//	friend int ReRoll(Age,int);	//Global Method

	Age operator==(Age);	//Operator Overload

//	friend ostream operator<<(ostream &, Age &);
//	friend istream operator>>(istream &, Age &);

	~Age();		//Destructor

};			//Do not Forget Semi-colon Here



#endif /* AGE_H_ */
